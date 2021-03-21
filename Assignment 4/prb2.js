function main() {
    var a = 1;
    function fun1() {

        var d = 4;
        print(a);
        print(d);
        function fun2(){
            
            var e = 5;
            print(a);
            print(d);
            print(e);
            function fun3(){

                var f = 6;
                print(a);
                print(d);
                print(e);
                print(f);

            }
        }
    }
}
