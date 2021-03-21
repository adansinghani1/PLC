// <while> -> while (boolexpr>) <statement>


void while_loop(){
    if (nextToken != WHIL_CODE){
        error ();

    }else{
        if (nextToeken != Left_PAREN){
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

// How do I want to express math operations
// Symbols or keywords?
// How do you want to express literals? 
// How do you express variables and identify them? Limitations?
// What are my key words in the language?