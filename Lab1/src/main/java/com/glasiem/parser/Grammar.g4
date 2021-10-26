grammar Grammar;

expression :
LPAREN expression RPAREN #ParenthesizedExpr
| expression EXPONENT expression #ExponentialExpr
| expression operatorToken=(MULTIPLY | DIVIDE) expression #MultiplicativeExpr
| expression operatorToken=(ADD | SUBTRACT) expression #AdditiveExpr
| NUMBER #NumberExpr
| operatorToken=(MAX | MIN) LPAREN expression COMA expression RPAREN #ComparativeExpr
| operatorToken=(INC | DEC) expression #IncreaseExpr
;


NUMBER : INT ('.' INT)?;

INT : ('0'..'9')+;

INC : 'inc';
DEC : 'dec';
MAX : 'max';
MIN : 'min';
COMA: ',';
EXPONENT : '^';
MULTIPLY : '*';
DIVIDE : '/';
SUBTRACT : '-';
ADD : '+';
LPAREN : '(';
RPAREN : ')';

WS : [ \t\r\n] -> channel(HIDDEN);