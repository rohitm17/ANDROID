<pre>
<B>Block03
</B>
  This block contains linear layout , Relative Layout and the use of weightsum, and layout_weight.
  It gives us the idea of how to use layouts and their weightage.
  This block also uses drawable.
  
<B>Block06</B>
  This block contains Seekbar and its functionalities.
  In this block we have a image and we are channging its color with the progress in the seekbar.
  
<B>Block07</B>
  In this block we have used WebView, NumberPicker and permissions of Internet in our manifest file.
  We have used String array to display contents of number picker.
  We have created a folder assets in which we have paste our local web pages.
  To open our local web pages we have used loadUrl method of webView.
  For links to open in our web view itself we have used WebViewClient.
<B>Block08</B>
  In this block we will learn how to build an app with multiple activities.
  for new activity: right-click on app> new > activity
  We have used Intent to move from one activity to other with some data.
  we use setClass() method to call second activity.
  then we call startActivity() method for second activity to start.
  we pass data using putExtra() method which includes key, value 
  key should be same on both activities.
  In SecondActivity first use getIntent() method, then use getFloatExtra() to get the key.
  
<B>Block09</B>
  In this block we use implicit intent to pass our message-text to our message-app of our mobile phone.
  cpcbility: ACTION_SENDTO
  we use Uri :
    URI(Uniform resource identifier) as its name suggests is used to identify resource
    (whether it be a page of text, a video or sound clip, a still or animated image, or a program).
    
