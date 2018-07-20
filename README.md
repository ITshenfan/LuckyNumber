# LuckyNumber
幸运大转盘，在一个安卓界面上，最开始是？点击按钮之后，开始出现随机数字。

每次点击按钮都会改变数字
核心代码如下：
 public void drawNumber(View v)
    {
        //Step 1 - make a reference to the lucky number text view
        TextView luckyNumberTV = (TextView)findViewById(R.id.luckynumber);


        //Step 2 - Use random object to generate a random number
        Random r = new Random();
        int n = r.nextInt(100) + 1;


        //Step 3 - update lucky number text view
        luckyNumberTV.setText(String.valueOf(n));
    }
