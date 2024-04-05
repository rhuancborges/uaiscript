grammar UaiScript;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
TIPO: 'tero'|'froti'| 'dupro'| 'buleano'| 'trem' | 'trenzim';
ATR: 'bota';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
RETORNO: 'vorta';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARITM: '+'|'-'|'*'|'/'|'%';
OP_LOG: 'nao'|'ou'|'e';
COMP: '='|'>'|'<'|'>='|'<=';
WS: [ \r\t\n]* -> skip;
VOID: 'nadanao';
DELIM: ';';
EST_REPET: 'uai'|'so'|'pra';
EST_COND: 'serasse'|'nenada';

