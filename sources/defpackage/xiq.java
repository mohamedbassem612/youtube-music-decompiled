package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Clock;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xiq implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xiq(Intent intent, plz plzVar, pma pmaVar, awrm awrmVar, long j, pnw pnwVar, int i) {
        this.$cid = i;
        this.e = intent;
        this.f = plzVar;
        this.b = pmaVar;
        this.d = awrmVar;
        this.a = j;
        this.c = pnwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pma] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, pnw] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            Intent intent = (Intent) this.e;
            intent.getAction();
            ((plz) this.f).d(intent, this.b, (plb) ((awrm) this.d).a, this.a, this.c);
            return;
        }
        int iHSVToColor = Color.HSVToColor(new float[]{(float) (Math.random() * 360.0d), 0.2f, 1.0f});
        TextView textView = (TextView) this.b;
        textView.setBackgroundColor(iHSVToColor);
        long j = this.a;
        DecimalFormat decimalFormat = (DecimalFormat) this.d;
        textView.setText(((String) this.c) + "\nFlash Call Time:" + decimalFormat.format((j / 1000.0d) % 1000.0d) + "\nUI Delay:" + decimalFormat.format((Clock.systemUTC().instant().minusMillis(j).toEpochMilli() / 1000.0d) % 1000.0d));
        Toast toastMakeText = Toast.makeText((Context) this.e, "", 0);
        toastMakeText.setView((View) this.f);
        toastMakeText.show();
    }

    public /* synthetic */ xiq(TextView textView, String str, DecimalFormat decimalFormat, long j, Context context, View view, int i) {
        this.$cid = i;
        this.b = textView;
        this.c = str;
        this.d = decimalFormat;
        this.a = j;
        this.e = context;
        this.f = view;
    }
}
