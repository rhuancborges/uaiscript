grammar UaiScript;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
TIPO: 'tero'|'froti'| 'dupro'| 'buleano'| 'trem' | 'trenzim';
VOID: 'nadanao';
ATR: 'bota';
EST_REPET: 'uai'|'so'|'pra';
EST_COND: 'serasse'|'nenada';
RETORNO: 'vorta';
OP_LOG: 'nao'|'ou'|'e';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
STRING: '"'(~["\r\n])*'"';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARITM: '+'|'-'|'*'|'/'|'%';
COMP: '='|'>'|'<'|'>='|'<=';
WS: [ \r\t\n]* -> skip;
DELIM: ';';
Erro: .;


