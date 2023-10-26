package cn.hx.plugin.junkcode.template

import java.security.SecureRandom

class ResTemplate {

    static final def DRAWABLE = '''<vector xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:aapt="http://schemas.android.com/aapt"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path
        android:fillType="evenOdd"
        android:pathData="M32,64C32,64 38.39,52.99 44.13,50.95C51.37,48.37 70.14,49.57 70.14,49.57L108.26,87.69L108,109.01L75.97,107.97L32,64Z"
        android:strokeWidth="1"
        android:strokeColor="#00000000">
        <aapt:attr name="android:fillColor">
            <gradient
                android:endX="78.5885"
                android:endY="90.9159"
                android:startX="48.7653"
                android:startY="61.0927"
                android:type="linear">
                <item
                    android:color="#44000000"
                    android:offset="0.0" />
                <item
                    android:color="#00000000"
                    android:offset="1.0" />
            </gradient>
        </aapt:attr>
    </path>
    <path
        android:fillColor="%s"
        android:fillType="nonZero"
        android:pathData="M66.94,46.02L66.94,46.02C72.44,50.07 76,56.61 76,64L32,64C32,56.61 35.56,50.11 40.98,46.06L36.18,41.19C35.45,40.45 35.45,39.3 36.18,38.56C36.91,37.81 38.05,37.81 38.78,38.56L44.25,44.05C47.18,42.57 50.48,41.71 54,41.71C57.48,41.71 60.78,42.57 63.68,44.05L69.11,38.56C69.84,37.81 70.98,37.81 71.71,38.56C72.44,39.3 72.44,40.45 71.71,41.19L66.94,46.02ZM62.94,56.92C64.08,56.92 65,56.01 65,54.88C65,53.76 64.08,52.85 62.94,52.85C61.8,52.85 60.88,53.76 60.88,54.88C60.88,56.01 61.8,56.92 62.94,56.92ZM45.06,56.92C46.2,56.92 47.13,56.01 47.13,54.88C47.13,53.76 46.2,52.85 45.06,52.85C43.92,52.85 43,53.76 43,54.88C43,56.01 43.92,56.92 45.06,56.92Z"
        android:strokeWidth="1"
        android:strokeColor="#00000000" />
</vector>'''



    // 生成指定范围内的整数
    static def randomLength(int min, int max) {
        SecureRandom secureRandom = new SecureRandom()
        int randomNum = secureRandom.nextInt(max) + min
        return randomNum
    }


    static randomLayoutContent () {
        def randomLayout = '''<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">'''
        switch (randomLength(0, 10)) {
            case 0:
                randomLayout += '''
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="15sp"/>
    </LinearLayout>'''
                break
            case 1:
                randomLayout += '''
    <androidx.viewpager2.widget.ViewPager2
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>'''
                break
            case 2:
                randomLayout += '''
    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textSize="23sp"
            android:textColor="@color/white"
            android:textAlignment="center"/>
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""/>
        
    </androidx.cardview.widget.CardView>
'''
                break
            case 3:
                randomLayout += '''
    <androidx.constraintlayout.widget.Guideline
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="20dp" />
'''
                break
            case 4:
                randomLayout += '''

    <View
        android:layout_width="2dp"
        android:layout_height="5dp"
        android:background="@color/white" />

    
    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/editor_os16"
        app:layout_constraintEnd_toEndOf="parent" />
'''
                break
            case 5:
                randomLayout += '''
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical">


        <View
            android:layout_width="2dp"
            android:layout_height="5dp"
            android:background="@color/white" />
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="15sp" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <ImageButton
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os17"/>

            <View
                android:layout_width="4dp"
                android:layout_height="25dp"/>
        </LinearLayout>
    </LinearLayout>
'''
                break
            case 6:
                randomLayout += '''        
        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <ImageButton
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os17"/>

            <View
                android:layout_width="4dp"
                android:layout_height="25dp"/>
        </LinearLayout>
'''
                break
            case 7:
                randomLayout += '''
        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text=""
                android:textSize="10sp"/>
            
            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os15"/>
        </LinearLayout>
'''
                break
            case 8:
                randomLayout += '''
    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
       
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">


            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os16"/>
        </LinearLayout>
    </androidx.cardview.widget.CardView>
'''
                break
            default:
                randomLayout += '''
    <FrameLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/editor_os12"/>
    </FrameLayout>
'''
        }


        switch (randomLength(0, 10)) {
            case 0:
                randomLayout += '''
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="15sp"/>
    </LinearLayout>'''
                break
            case 1:
                randomLayout += '''


    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher"
        />

    <androidx.viewpager2.widget.ViewPager2
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>'''
                break
            case 2:
                randomLayout += '''
    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textSize="23sp"
            android:textColor="@color/white"
            android:textAlignment="center"/>
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/app_name"/>
        
    </androidx.cardview.widget.CardView>
'''
                break
            case 3:
                randomLayout += '''


    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:visibility="gone"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/black"
            android:visibility="gone"
            android:textAlignment="center"
            android:textSize="56sp"/>
    </androidx.cardview.widget.CardView>

    <androidx.constraintlayout.widget.Guideline
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="20dp" />
'''
                break
            case 4:
                randomLayout += '''

    <FrameLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        >

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="15sp"/>


        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:visibility="gone"
            android:textSize="45sp"/>

 </FrameLayout>
'''
                break
            case 5:
                randomLayout += '''
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical">


        <View
            android:layout_width="2dp"
            android:layout_height="5dp"
            android:background="@color/white" />
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="15sp" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <ImageButton
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os17"/>

            <View
                android:layout_width="4dp"
                android:layout_height="25dp"/>
        </LinearLayout>
    </LinearLayout>
'''
                break
            case 6:
                randomLayout += '''        
        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <ImageButton
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os17"/>

            <View
                android:layout_width="4dp"
                android:layout_height="25dp"/>
        </LinearLayout>
'''
                break
            case 7:
                randomLayout += '''
        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text=""
                android:textSize="10sp"/>
            
            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os11"/>
        </LinearLayout>
'''
                break
            case 8:
                randomLayout += '''
    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
       
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">


            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os16"/>
        </LinearLayout>
    </androidx.cardview.widget.CardView>
'''
                break
            case 9: '''
    <androidx.constraintlayout.widget.Guideline
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="20dp" />
'''
            default:
                randomLayout += '''
    

    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:visibility="gone">


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="56sp"
            android:visibility="gone" />

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher"
            android:visibility="gone" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="45sp"
            android:visibility="gone" />
    </RelativeLayout>

'''
        }


        switch (randomLength(0, 10)) {
            case 0:
                randomLayout += '''
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="15sp"/>
    </LinearLayout>'''
                break
            case 1:
                randomLayout += '''


    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher"
        />

    <androidx.viewpager2.widget.ViewPager2
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>'''
                break
            case 2:
                randomLayout += '''
    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textSize="23sp"
            android:textColor="@color/white"
            android:textAlignment="center"/>
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/app_name"/>
        
    </androidx.cardview.widget.CardView>
'''
                break
            case 3:
                randomLayout += '''


    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:visibility="gone"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/black"
            android:visibility="gone"
            android:textAlignment="center"
            android:textSize="56sp"/>
    </androidx.cardview.widget.CardView>

    <androidx.constraintlayout.widget.Guideline
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="20dp" />
'''
                break
            case 4:
                randomLayout += '''

    <FrameLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        >

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="15sp"/>


        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:visibility="gone"
            android:textSize="45sp"/>

 </FrameLayout>
'''
                break
            case 5:
                randomLayout += '''
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical">


        <View
            android:layout_width="2dp"
            android:layout_height="5dp"
            android:background="@color/white" />
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="15sp" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <ImageButton
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os17"/>

            <View
                android:layout_width="4dp"
                android:layout_height="25dp"/>
        </LinearLayout>
    </LinearLayout>
'''
                break
            case 6:
                randomLayout += '''        
        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <ImageButton
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os17"/>

            <View
                android:layout_width="4dp"
                android:layout_height="25dp"/>
        </LinearLayout>
'''
                break
            case 7:
                randomLayout += '''
        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text=""
                android:textSize="10sp"/>
            
            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os11"/>
        </LinearLayout>
'''
                break
            case 8:
                randomLayout += '''
    <androidx.cardview.widget.CardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
       
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">


            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os16"/>
        </LinearLayout>
    </androidx.cardview.widget.CardView>
'''
                break
            case 9: '''
    <androidx.constraintlayout.widget.Guideline
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="20dp" />
'''
            default:
                randomLayout += '''
    

    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:visibility="gone">


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="56sp"
            android:visibility="gone" />

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher"
            android:visibility="gone" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="45sp"
            android:visibility="gone" />
    </RelativeLayout>

'''
        }


        switch (randomLength(0, 10)) {
            case 0:
                randomLayout += '''
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=""
            android:layout_gravity="center" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center" />
    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 1:
                randomLayout += '''
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/editor_os16"/>
    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 2:
                randomLayout += '''
    <androidx.constraintlayout.widget.Guideline
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="45dp" />
        
    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 3:
                randomLayout += '''
    <FrameLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/editor_os12" />
    </FrameLayout>

    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 4:
                randomLayout += '''
      
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@mipmap/ic_launcher" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <ImageButton
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/editor_os17"/>
        </LinearLayout>

    </LinearLayout>

    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 5:
                randomLayout += '''
        
    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 6:
                randomLayout += '''
        <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 7:
                randomLayout += '''
        
    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">


        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@color/black"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"/>

    </RelativeLayout>
    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            case 8:
                randomLayout += '''
        
    <FrameLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="" />

    <androidx.viewpager2.widget.ViewPager2
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/editor_os12" />
    </FrameLayout>

    </androidx.constraintlayout.widget.ConstraintLayout>'''
                break
            default:
                randomLayout += '''
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/editor_os16"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center" />
    </androidx.constraintlayout.widget.ConstraintLayout>'''
        }
        return randomLayout
    }
}