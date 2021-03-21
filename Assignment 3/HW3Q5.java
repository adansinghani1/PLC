// Write an EBNF rule that describes the while statement of Java or C++.
// <while_stmt> -> WHILE ‘(‘ (<arithmetic_expr> | <logic_expr>) ‘)’
// <block> <block> -> <stmt> | ‘{ ‘ <stmt> {<stmt>} ‘ }’

class Main {
	public static void main(String[] args) {
		static while_loop() {
			if (currToken != while_Code) {
				return null; //error()

			}
			else
			{
				if (currToken != left_Parenthesis) {
					return null; //error()
				}
				else
				{
					boolexpr();
					if (currToken != right_Parenthesis) {
						return null; //error()
					}
					else
					{
						statement();
						// statement is true
					}
				}
			}
		}
	}
}
