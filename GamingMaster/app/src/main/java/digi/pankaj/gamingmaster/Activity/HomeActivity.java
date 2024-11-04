package digi.pankaj.gamingmaster.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;
import java.util.List;

import digi.pankaj.gamingmaster.Adapter.RecyclerViewAdapter;
import digi.pankaj.gamingmaster.Modal.RecyclerModal;
import digi.pankaj.gamingmaster.R;

public class HomeActivity extends AppCompatActivity {

    ImageSlider image_slider;

    DrawerLayout drawerLayout;

    MaterialToolbar toolbar;

    RecyclerView actionRecycler,racingRecycler,snackRecycler,cardRecycler,boardRecycler,bubbleRecycler,adventureRecycler;

    RecyclerViewAdapter actionAdapter,racingAdapter,snackAdapter,cardAdapter,boardAdapter,bubbleAdapter,adventureAdapter;

    List<RecyclerModal> actionRecyclerModalList = new ArrayList<>();
    List<RecyclerModal> reacingRecyclerModalList = new ArrayList<>();
    List<RecyclerModal> snackRecyclerModelList = new ArrayList<>();
    List<RecyclerModal> cardRecyclerRecyclerModelList = new ArrayList<>();
    List<RecyclerModal> boardRecyclerModelList = new ArrayList<>();
    List<RecyclerModal> bubbleRecyclerModelList =new ArrayList<>();
    List<RecyclerModal> adventureAdapterModelList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        actionRecycler=findViewById(R.id.actionRecycler);
        racingRecycler=findViewById(R.id.racingGame);
        snackRecycler=findViewById(R.id.snackGame);
        cardRecycler=findViewById(R.id.cardGame);
        boardRecycler=findViewById(R.id.boardGame);
        bubbleRecycler=findViewById(R.id.bubbleShooterGame);
        adventureRecycler=findViewById(R.id.adventureGame);


        actionRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        actionRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        actionRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        actionRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        actionRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        actionRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));


        actionAdapter = new RecyclerViewAdapter(actionRecyclerModalList,HomeActivity.this);
        actionRecycler.setAdapter(actionAdapter);
        actionRecycler.setLayoutManager(new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false));


        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));
        reacingRecyclerModalList.add(new RecyclerModal("https://play-lh.googleusercontent.com/1csS50TNJYw5fD5PgZP7uqMArE0jFsQ-xiXWbTTu0MAdKtFKEVTUSJpy2IQpLgCVkA=w2560-h1440-rw","Dynamons World","https://play-lh.googleusercontent.com/BpDAXJxCCpLI2e9_GsxqzVANbnbjxj1e-1-ETrsjd-mq1A33Wa5nvS-SkSp_sUki0Iq6=w240-h480-rw","Action games",true));

        racingAdapter = new RecyclerViewAdapter(reacingRecyclerModalList,HomeActivity.this);
        racingRecycler.setLayoutManager(new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false));
        racingRecycler.setAdapter(racingAdapter);


        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));
        snackRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/2pfY8PQ6WubFyZwIEI798wuOSG8FTQX3mxi7ZVDZF6DQw29Mg6Y2lqp6ezjPDOdBfQ=w2560-h1440-rw","Snake Run Race","https://play-lh.googleusercontent.com/MZ4gG1DCdRSrVm6D8GBEBAVNKKMUfNKYmQg1CDRraIz6YQqqUlh4RO3h0N7Oy5oBflM=w240-h480-rw","Snack game",true));

        snackAdapter = new RecyclerViewAdapter(snackRecyclerModelList,HomeActivity.this);
        snackRecycler.setLayoutManager(new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false));
        snackRecycler.setAdapter(snackAdapter);


        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));
        cardRecyclerRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/0xuh1bTVEsx3xQeGue5z_XiKVk3iXC5uM4caAWzCIfZx398kHn6L9KbePcD0XYgkvw=w2560-h1440-rw","Solitaire Card Game","https://play-lh.googleusercontent.com/uCCG7YtYg533QJbLaMlFUabbuSp6b1LXSagdidHMigpiE0VXA6e_LNUs4NaG3AiViEU=w240-h480-rw","Card game",true));

         cardAdapter =new RecyclerViewAdapter(cardRecyclerRecyclerModelList,HomeActivity.this);
         cardRecycler.setLayoutManager(new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false));
         cardRecycler.setAdapter(cardAdapter);


         boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));
        boardRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/_AhqsbtIZOWDrs-Vp8iHHxw5ky_WZsRZnlmZwr2ptUr_uUUdW1sH-YXFfjEyveVQkE4=w2560-h1440-rw","Ludo SuperStar","https://play-lh.googleusercontent.com/PvUbpM1Stk0H3LUY2bkuzURN0D5gu3zRB53g212VedzGwwJ37c5-NicDUoW6uNUfxXXa=w240-h480-rw","Board game",true));

       boardAdapter = new RecyclerViewAdapter(cardRecyclerRecyclerModelList,HomeActivity.this);
       boardRecycler.setLayoutManager(new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false));
       boardRecycler.setAdapter(boardAdapter);



       bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));
        bubbleRecyclerModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/e1qwivFEwmQ_j7W2x7b_SrkRyLzl7eBFWl38o9ZMoeEZvpJx-RU3-K-4NftWPj9zGJG5=w2560-h1440-rw","Bubble Shooter","https://play-lh.googleusercontent.com/neBzNROkl-lHU8ET3pJ87Z1PkINwgRx0eIa3THgMJuHdr54qyxUxvgdDPdJNcyzmEw=w240-h480-rw","Bubble game",true));


        bubbleAdapter =new RecyclerViewAdapter(cardRecyclerRecyclerModelList,HomeActivity.this);
        bubbleRecycler.setLayoutManager(new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false));
        bubbleRecycler.setAdapter(bubbleAdapter);


        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));
        adventureAdapterModelList.add(new RecyclerModal("https://play-lh.googleusercontent.com/EBqGDAk25c7eU4srCGaLEfyTLKw8GE1OakMuN0CAsZ6PPj0nVZXOVGmGAm-TK2yEuUg=w2560-h1440-rw","Alien Zone Plus","https://play-lh.googleusercontent.com/gMtLeqHKkK17vsu6hVeTHoCExKKYFbUdLEUTEhALGCzLL39-2ILR2XWYU0_82MxwoOE=w240-h480-rw","Action game",true));

        adventureAdapter = new RecyclerViewAdapter(adventureAdapterModelList,HomeActivity.this);
        adventureRecycler.setLayoutManager(new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false));
       adventureRecycler.setAdapter(actionAdapter);



        toolbar=findViewById(R.id.toolbar);


        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.searchMenu){
                    startActivity(new Intent(HomeActivity.this, SearchActivity.class));
                }else if (id == R.id.notificationMenu){
                    Toast.makeText(HomeActivity.this, "Notification is not recieved", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });
        image_slider=findViewById(R.id.image_slider);


        List<SlideModel> slideModelList=new ArrayList<>();

        slideModelList.add(new SlideModel("https://images.freecreatives.com/wp-content/uploads/2015/04/Video-Game-Desktop-Backgrounds-2.jpg", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel("https://images.freecreatives.com/wp-content/uploads/2015/04/Video-Game-Desktop-Backgrounds-2.jpg", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel("https://images.freecreatives.com/wp-content/uploads/2015/04/Video-Game-Desktop-Backgrounds-2.jpg", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel("https://images.freecreatives.com/wp-content/uploads/2015/04/Video-Game-Desktop-Backgrounds-2.jpg", ScaleTypes.CENTER_CROP));

        image_slider.setImageList(slideModelList);
        drawerLayout=findViewById(R.id.drawerlayout);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


    }
}