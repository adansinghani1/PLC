// Write an EBNF rule that describes the while statement of Java or C++.
// <while_stmt> -> WHILE ‘(‘ (<arithmetic_expr> | <logic_expr>) ‘)’
//<block> <block> -> <stmt> | ‘{ ‘ <stmt> {<stmt>} ‘ }’


static while_loop(){
    if (nextToken != WHIL_CODE){
        error ();

    }else{
        if (nextToken != Left_PAREN){
            error();
        } else{
            boolexpr();
            if (nextToken != RIGHT_PAREN){
                error();
            }else{
                statement();
            }
        }

    }
}
