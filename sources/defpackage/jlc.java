package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jlc implements View.OnClickListener {
    private final awlo a;

    public jlc(long j, avmb avmbVar) {
        awlo awloVar = new awlo();
        this.a = awloVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        avmb avmbVar2 = awlg.b;
        avnn avnnVar = atqp.g;
        timeUnit.getClass();
        avmbVar2.getClass();
        awfk awfkVar = new awfk(awloVar, j, timeUnit, avmbVar2);
        avnn avnnVar2 = atqp.l;
        awfkVar.O(avmbVar).ag(new iho(this, 14), new ihp(7));
    }

    public abstract void a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.kk(view);
    }
}
