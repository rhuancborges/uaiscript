grammar UaiScript;

inicio: (funcoes)* main EOF;
funcoes: decl_func AP ((decl_var VIRG)|decl_var)* FP AC main (RETORNO operacao DELIM)? FC;
main: ((atrib | acao | funcao) DELIM | condicao | laco)+;
decl_func: (TIPO|VOID) ID;
decl_var: TIPO ID;
atrib: decl_var (ATR (casting|operacao|STR))? | ID ATR (casting|STR|operacao);
acao: 'input' AP STR? FP | 'print' AP operacao FP;
operacao: operando operando_cauda?;
operando: NUM|ID;
operando_cauda: OP_ARITM operando (operando_cauda)*;
funcao: ((decl_var|ID) ATR)? ID AP ((operacao VIRG)|operacao)* FP;
condicao: IF AP (expressao) FP AC main FC condicaoElse?;
condicaoElse: ELSE (AC main FC|condicao);
laco: WHILE (expressao) AC main FC
      | DO AC main FC WHILE AP (expressao) FP DELIM
      | FOR AP (atrib DELIM ID COMP operando DELIM ID ('++'|'--')) FP AC main FC;
expressao: operacao COMP (NUM|ID|funcao) (OP_LOG expressao)*;
casting: TIPO AP (operacao|acao) FP;


fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
TIPO: 'tero'|'froti'| 'dupro'| 'buleano'| 'trem' | 'trenzim';
VOID: 'nadanao';
ATR: 'bota';
WHILE: 'uai';
DO: 'so';
FOR: 'pra';
IF: 'serasse';
ELSE: 'nenada';
RETORNO: 'vorta';
OP_LOG: 'nao'|'ou'|'e';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
STR: '"'(~["\r\n])*'"';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARITM: '+'|'-'|'*'|'/'|'%';
COMP: '='|'>'|'<'|'>='|'<='|'!=';
WS: [ \r\t\n]* -> skip;
DELIM: ';';
VIRG: ',';



