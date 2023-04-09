package in.thbd.mybank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.thbd.mybank.Adapter.MyOfferAdapter;
import in.thbd.mybank.Adapter.OptionAdapter;
import in.thbd.mybank.Model.Myoffer;
import in.thbd.mybank.Model.OptionModel;

public class MainActivity extends AppCompatActivity {

    List<Myoffer> modelList = new ArrayList<>();
    MyOfferAdapter adapter;
    RecyclerView recyclerView,gridRecyclerView;
    List<OptionModel> optionModelList = new ArrayList<>();
    OptionAdapter optionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =  findViewById(R.id.recyclerViewID);
        gridRecyclerView =  findViewById(R.id.recyclerViewGridID);

        modelList.add(new Myoffer("19 TK 1GB offer for 7 Days",R.drawable.ic_browse));
        modelList.add(new Myoffer("33 TK 3GB offer for 15 Days",R.drawable.ic_browse));
        modelList.add(new Myoffer("119 TK 250Min offer for 30 Days",R.drawable.ic_phone));
        modelList.add(new Myoffer("49 TK 500SMS offer for 30 Days",R.drawable.ic_sms));

        adapter = new MyOfferAdapter(modelList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        optionModelList.add(new OptionModel("Flexiplan", R.drawable.img_flexi));
        optionModelList.add(new OptionModel("Internet", R.drawable.img_internet));
        optionModelList.add(new OptionModel("Minutes", R.drawable.img_mint));
        optionModelList.add(new OptionModel("Recharges", R.drawable.img_recharg));
        optionModelList.add(new OptionModel("Sports", R.drawable.img_sports));
        optionModelList.add(new OptionModel("Bundles", R.drawable.img_bundles));
        optionModelList.add(new OptionModel("My Offers", R.drawable.img_my_offers));
        optionModelList.add(new OptionModel("Cashback Offers", R.drawable.img_cashbk_offers));

        optionAdapter = new OptionAdapter(optionModelList);
        gridRecyclerView.setAdapter(optionAdapter);
        optionAdapter.notifyDataSetChanged();

    }
}