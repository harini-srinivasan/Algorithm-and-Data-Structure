/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
 var myPow = function(x, n) {
    if(n<0)
    {
        return 1 / myPow(x, -n);
    }
    if(x === 1 || n === 0 )
    {
        return 1;
    }
    if(n === 1)
    {
        return x;
    }
    if(n % 2 ===0)
    {
        var res = myPow(x, n/2);
        return res * res;
    }
    else 
    {
         var res = myPow(x, (n-1)/2);
         return res * res * x;
    }
};