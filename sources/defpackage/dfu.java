package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class dfu extends gr {
    public static final axx a = new dfp();
    public final dij b;
    public final dfr c;
    public ArrayList d;
    public final Handler e;
    private did f;
    private TextView g;
    private TextView h;
    private RelativeLayout i;
    private TextView j;
    private TextView k;
    private LinearLayout l;
    private Button m;
    private ProgressBar n;
    private ListView o;
    private dfs p;
    private final dft q;
    private boolean r;
    private long s;

    /* JADX WARN: Illegal instructions before constructor call */
    public dfu(Context context) {
        Context contextM = ast.m(context, 0, false);
        super(contextM, ast.h(contextM));
        this.f = did.a;
        this.e = new dfq(this);
        this.b = dij.b(getContext());
        this.c = new dfr(this);
        this.q = new dft(this);
    }

    public void b(List list) {
        int size = list.size();
        while (size > 0) {
            size--;
            if (!l((dii) list.get(size))) {
                list.remove(size);
            }
        }
    }

    @Override // defpackage.gr, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            getContext().unregisterReceiver(this.q);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void h() {
        if (this.r) {
            ArrayList arrayList = new ArrayList(dij.i());
            b(arrayList);
            Collections.sort(arrayList, aqv.a);
            if (SystemClock.uptimeMillis() - this.s >= 300) {
                jq(arrayList);
                return;
            }
            Handler handler = this.e;
            handler.removeMessages(1);
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.s + 300);
        }
    }

    public final void i(did didVar) {
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f.equals(didVar)) {
            return;
        }
        this.f = didVar;
        if (this.r) {
            dij dijVar = this.b;
            dfr dfrVar = this.c;
            dijVar.q(dfrVar);
            dijVar.p(didVar, dfrVar, 1);
        }
        h();
    }

    final void j() {
        getWindow().setLayout(vm.l(getContext()), -2);
    }

    final void jq(List list) {
        this.s = SystemClock.uptimeMillis();
        this.d.clear();
        this.d.addAll(list);
        this.p.notifyDataSetChanged();
        Handler handler = this.e;
        handler.removeMessages(3);
        handler.removeMessages(2);
        if (!list.isEmpty()) {
            k(1);
        } else {
            k(0);
            handler.sendMessageDelayed(handler.obtainMessage(2), 5000L);
        }
    }

    final void k(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.o.setVisibility(8);
            this.h.setVisibility(0);
            this.n.setVisibility(0);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.k.setVisibility(8);
            this.i.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.o.setVisibility(0);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.k.setVisibility(8);
            this.i.setVisibility(8);
            return;
        }
        if (i != 2) {
            setTitle(R.string.mr_chooser_zero_routes_found_title);
            this.o.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            this.l.setVisibility(0);
            this.m.setVisibility(0);
            this.k.setVisibility(0);
            this.i.setVisibility(0);
            return;
        }
        setTitle(R.string.mr_chooser_title);
        this.o.setVisibility(8);
        this.h.setVisibility(8);
        this.n.setVisibility(0);
        this.l.setVisibility(8);
        this.m.setVisibility(8);
        this.k.setVisibility(4);
        this.i.setVisibility(0);
    }

    public final boolean l(dii diiVar) {
        return !diiVar.l() && diiVar.h && diiVar.p(this.f);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
        this.b.p(this.f, this.c, 1);
        h();
        Handler handler = this.e;
        handler.removeMessages(2);
        handler.removeMessages(3);
        handler.removeMessages(1);
        handler.sendMessageDelayed(handler.obtainMessage(2), 5000L);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.d = new ArrayList();
        this.p = new dfs(getContext(), this.d);
        this.g = (TextView) findViewById(R.id.mr_chooser_title);
        this.h = (TextView) findViewById(R.id.mr_chooser_searching);
        this.i = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.j = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.k = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.l = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.m = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.n = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        if (vm.n == null) {
            vm.n = Boolean.valueOf((vm.o(context) || vm.q(context) || vm.m(context) || vm.p(context)) ? false : true);
        }
        if (vm.n.booleanValue()) {
            string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        } else {
            if (vm.o == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                vm.o = Boolean.valueOf((Build.VERSION.SDK_INT < 30 || sensorManager == null || sensorManager.getDefaultSensor(36) == null) ? false : true);
            }
            if (vm.o.booleanValue()) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
            } else if (vm.o(context) || vm.n(context.getResources())) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
            } else if (vm.p(context)) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
            } else if (vm.q(context)) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
            } else {
                string = vm.m(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
            }
        }
        this.j.setText(string);
        this.k.setMovementMethod(LinkMovementMethod.getInstance());
        this.m.setOnClickListener(new jn(this, 4, null));
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.o = listView;
        listView.setAdapter((ListAdapter) this.p);
        this.o.setOnItemClickListener(this.p);
        this.o.setEmptyView(findViewById(android.R.id.empty));
        j();
        getContext().registerReceiver(this.q, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.r = false;
        this.b.q(this.c);
        Handler handler = this.e;
        handler.removeMessages(1);
        handler.removeMessages(2);
        handler.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.gr, android.app.Dialog
    public final void setTitle(int i) {
        this.g.setText(i);
    }

    @Override // defpackage.gr, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.g.setText(charSequence);
    }
}
