package tw.edu.pu.s1071646.atom3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerMainActivity extends AppCompatActivity implements View.OnClickListener {


    static int[] images = {R.drawable.hero1,R.drawable.hero2,R.drawable.hero3,R.drawable.hero4,R.drawable.hero5,
            R.drawable.hero6,R.drawable.hero7,R.drawable.hero8,R.drawable.hero9,R.drawable.hero10,
            R.drawable.hero11,R.drawable.hero12,R.drawable.hero13,R.drawable.hero14,R.drawable.hero15,R.drawable.hero16};

    static String[] name = {"牙素","札克","悠咪","索娜","艾妮維亞","提摩","維迦",
            "史加納","貪啃奇","埃爾文","八德","辛吉德","薩柯","索拉卡","希格斯","雷玟"};

    //String[] title = {"疾風劍豪","生化魔人","",""}
    int[] ImagePos = {R.drawable.ad1,R.drawable.sup1,R.drawable.mid1,R.drawable.top1,R.drawable.jg1};
    int[] skill ={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,
            R.drawable.a7,R.drawable.a8,R.drawable.a9};
    String[] skillName = {"傳送","閃現","重擊","鬼步","淨化","點燃","治癒","光盾","虛弱"};
    String[] skillUse = {"在引導4.5秒後，將英雄傳送到友方建築物、小兵或守衛旁邊","使英雄朝著你的指針所停的區域瞬間傳送一小段距離",
            "對目標史詩野怪、大型野怪或敵方小兵造成（取決於英雄等級）點真實傷害","你的英雄在移動時無視單位的碰撞體積，移動速度增加","移除身上的所有限制效果和召喚師技能的減益效果，並且若在接下來的3秒裡再次被施加限制效果時，新效果的持續時間會減少65%",
            "對單體敵方目標施放的持續性傷害技能，在5秒的持續時間裡造成80-505（於1-18級） [5]  真實傷害，獲得目標的視野，並減少目標所受的治療和回復效果","為你和目標友軍英雄回复95-345（取決於英雄等級）生命值，並為你和目標友軍英雄提供30%移動速度加成，持續1秒。若目標近期已受到過其它治療術的影響，則治療術對目標產生的治療效果減半",
            "為你的英雄套上護盾，吸收115-455（取決於英雄等級）點傷害，持續2秒","虛弱目標敵方英雄，降低目標英雄30%的移動速度和攻擊速度，以及10護甲與魔法抗性，並且他們所造成的傷害減少40%，持續2.5秒"};
    String[] posName = {"下路(ad)","輔助(sup)","中路(mid)","上路(top)","打野(jg)"};
    ImageView imageHero1 ;
    ImageView imagePos;
    TextView textName;
    Button draw ;
    Button BtnSkill1;
    Button BtnSkill2;
    Button BtnPos;
    Button BtnHero;
    ImageView imageSkill;
    ImageView imageSkill2;
    ImageButton BtbB;
    int count;
    int pos;
    int skill1;
    int skill2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_main);
        MainActivity.mp = MediaPlayer.create(this,R.raw.lengend3);
        imageHero1 = findViewById(R.id.imageHero1);
        imagePos = findViewById(R.id.imagePos2);
        draw = findViewById(R.id.btnDraw);
        textName = findViewById(R.id.textName);
        imageSkill = findViewById(R.id.imageSkill);
        imageSkill2 = findViewById(R.id.imageSkill2);
        BtbB = findViewById(R.id.BtbB);
        BtnSkill1 = findViewById(R.id.BtnSkill1);
        BtnSkill2 = findViewById(R.id.BtnSkill2);
        BtnPos = findViewById(R.id.BtnPos);
        BtnHero = findViewById(R.id.BtnHero);

        count =  (int)Math.round(Math.random()*(images.length-1));
        pos = (int)Math.round(Math.random()*(ImagePos.length-1));
        skill1 = (int)Math.round(Math.random()*(skill.length-1));
        skill2 = (int)Math.round(Math.random()*(skill.length-1));
        while(skill1==skill2){
            skill2 = (int)Math.round(Math.random()*(skill.length-1));
        }
        //imageHero1.setImageResource(images[count]);
        imageHero1.setBackgroundResource(images[count]);
        imagePos.setImageResource(ImagePos[pos]);
        textName.setText(name[count]);
        imageSkill.setImageResource(skill[skill1]);
        imageSkill2.setImageResource(skill[skill2]);

        draw.setOnClickListener(this);
        BtbB.setOnClickListener(this);
        BtnSkill1.setOnClickListener(this);
        BtnSkill2.setOnClickListener(this);
        BtnPos.setOnClickListener(this);
        BtnHero.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDraw:
                count = (int)Math.round(Math.random()*(images.length-1));
                pos = (int)Math.round(Math.random()*(ImagePos.length-1));
                skill1 = (int)Math.round(Math.random()*(skill.length-1));
                skill2 = (int)Math.round(Math.random()*(skill.length-1));
                while(skill1==skill2){
                    skill2 = (int)Math.round(Math.random()*(skill.length-1));
                }
                //Log.d("Math.random()",Math.random()+"");
                //Log.d("images.length",images.length+"");
                //Log.d("AAA",(int)Math.round(Math.random()*(images.length))+"");
                //imageHero1.setImageDrawable(getResources().getDrawable(ImagePos[pos]));
                imageHero1.setBackgroundResource(images[count]);
                textName.setText(name[count]);
                imagePos.setImageResource(ImagePos[pos]);
                imageSkill.setImageResource(skill[skill1]);
                imageSkill2.setImageResource(skill[skill2]);
                break;
            case R.id.BtbB:
                Intent it = new Intent(PlayerMainActivity.this,MainActivity.class);
                MainActivity.mp.stop();
                startActivity(it);
                break;
            case R.id.BtnSkill1:
                new AlertDialog.Builder(this).setIcon(skill[skill1]).setTitle(skillName[skill1]).setMessage(skillUse[skill1]).setNegativeButton("看完了",null).show();
                break;
            case R.id.BtnSkill2:
                new AlertDialog.Builder(this).setIcon(skill[skill2]).setTitle(skillName[skill2]).setMessage(skillUse[skill2]).setNegativeButton("看完了",null).show();
                break;
            case R.id.BtnPos:
                Toast.makeText(PlayerMainActivity.this,"你所選擇的路線是 : "+posName[pos],Toast.LENGTH_SHORT).show();
                break;
            case R.id.BtnHero:
                Bundle bd = new Bundle();
                bd.putInt("num",count);
                Intent it2 = new Intent(PlayerMainActivity.this,Hero2.class);
                it2.putExtras(bd);
                startActivity(it2);
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(!MainActivity.mp.isPlaying())
            MainActivity.mp.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //MainActivity.mp.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MainActivity.mp.stop();
        MainActivity.mp.release();

    }
}