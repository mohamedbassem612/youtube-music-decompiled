package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qnw extends bp {
    public ListAdapter r;

    public static int t(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    protected abstract int i();

    protected abstract AdapterView.OnItemClickListener j();

    protected abstract ListAdapter k();

    protected abstract String l();

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(1, 0);
    }

    @Override // defpackage.cc
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate;
        this.r = k();
        int i = i();
        if (i == 0) {
            viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
            ListView listView = (ListView) viewInflate.findViewById(R.id.bottom_sheet_list_view);
            listView.setAdapter(this.r);
            listView.setOnItemClickListener(j());
        } else if (i != 1) {
            viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_dialog_fragment, viewGroup, false);
        } else {
            viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_grid_fragment, viewGroup, false);
            GridView gridView = (GridView) viewInflate.findViewById(R.id.bottom_sheet_grid_view);
            gridView.setAdapter(this.r);
            gridView.setOnItemClickListener(j());
        }
        String strL = l();
        TextView textView = (TextView) viewInflate.findViewById(R.id.bottom_sheet_title);
        if (TextUtils.isEmpty(strL)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strL);
            textView.setVisibility(0);
        }
        return viewInflate;
    }

    @Override // defpackage.bp, defpackage.cc
    public void onStart() {
        super.onStart();
        Window window = this.f.getWindow();
        int i = -1;
        if (i() == 2 && t(getActivity()) > 600) {
            i = -2;
        }
        window.setLayout(i, -2);
        this.f.getWindow().setBackgroundDrawableResource(android.R.color.white);
        this.f.getWindow().setGravity(81);
        this.f.getWindow().setWindowAnimations(R.style.SlideUpDownAnimation);
    }
}
