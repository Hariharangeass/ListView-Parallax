#Parallax List View in Android 
###A quick Android project developed by <a href="https://github.com/rajatpunkstaa">Rajat Gupta </a> to demonstrate ListView parallax effect.You can go a little further and make the list header parallax animation with an view stick to top when list is scrolled.
<h1>
<img src="https://camo.githubusercontent.com/8286612a56fdc713e9383a2a4b611eb7810a9fe0/687474703a2f2f796179616e64726f69642e636f6d2f646174612f6769746875625f6c6962726172792f706172616c6c61785f72656379636c6572766965772f706172616c6c61785f72656379636c6572766965772e676966?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=3153" align="right"/>
</h1>
##Compatibility

####This library works on 2.2+ probably earlier as well, but i didn't even bother to test because i believe at some point we have to stop supporting every version ;)

##Usage

####Get your ParallaxListView instance, and set its adapter as shown in sample. You need to provide a ParallaxImageView, which will handle parallax effect, on your listView's item.

####In your adapter create a ViewHolder which extends ParallaxViewHolder. You need to use these specifications:

` viewHolder.itemView = convertView;
  viewHolder.setBackgroundImage((ParallaxImageView) convertView.findViewById(R.id.parallaxImageView)); `
####And this method needs to be called on getView method to notify ParallaxImageView that will be displayed once again, so it will re-center itself.

`viewHolder.getBackgroundImage().reuse();`

####If you wish to change Parallax effects ratio, you can simple call setParallaxRatio on code, or you can set it by xml with parallax_ratio attribute.

###### Check out the Google Developer Documentation for any further info. I'd love to hear from you :) 
