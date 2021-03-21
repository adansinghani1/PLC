function main() {
    var x = 1;
    sub1()
    function sub1() {

        var y = x;
        sub2();
        //console.log(y);
        function sub2(){
            
            var z = y;
            sub3()
            //console.log(z);
            function sub3(){

                var a = z;
                console.log(a);
                //print(a);
                // When printing a, it should print the orginal value 1
                // Java example of static scoping: int a = i + 2; -> a = this.sum


            }
        }
    }
}
