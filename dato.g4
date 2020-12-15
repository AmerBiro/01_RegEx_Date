grammar dato;

start   : d=IDENTIFIER  EOF ;

IDENTIFIER : Text Day SEPERATE Month SEPERATE Year End;

Text : 'Today is: ';
//Text : [Today is: ];
SEPERATE: ([/] || [-]);
Day : ([0][1-9] || [1-2][0-9] || [3][0-1] );
Month : ([0][1-9] || [1][0-2]);
Year : ([1][9][9][0-9]) || '20'([0-1][0-9] || '20');
End : '.'+;

//IDENTIFIER : [a-zA-Z] [ a-zA-Z0-9_]*;

WHITESPACES : [ \t\n]+  -> skip;
// Tab or a line new will be skipped

Comment : ('//' (~[\n])*) -> skip;
//  '//' is a start key.
// (~[\n]*) if a line starts with the provided key, and then there is a new line, the whole line will be commented.

MULTICOMMENT: ('/*' (('*' ~[/] | ~[*])*) '*/') -> skip;