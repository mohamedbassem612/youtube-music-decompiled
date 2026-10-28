package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class wzv implements adma {
    protected final View a;
    private final TextView c = g();
    private final TextView d = f();
    protected final ImageView b = e();

    public wzv(Context context) {
        this.a = View.inflate(context, d(), null);
        i(context);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    protected abstract int d();

    protected abstract ImageView e();

    protected abstract TextView f();

    protected abstract TextView g();

    protected abstract void h(aqmh aqmhVar);

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        amox amoxVar = (amox) obj;
        if ((amoxVar.b & 16) != 0) {
            alayVar = amoxVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(this.c, ackj.k(null, alayVar, null, false));
        TextView textView = this.d;
        if ((amoxVar.b & 32) != 0) {
            alayVar2 = amoxVar.f;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView, ackj.k(null, alayVar2, null, false));
        if (this.b != null) {
            aqmh aqmhVar = amoxVar.g;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            h(aqmhVar);
        }
    }

    protected void i(Context context) {
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        tym.i(this.a, new oqe(marginLayoutParams, 11), new tye(tym.g(-1, -2), new tyj(dimensionPixelOffset, 0), new tyi(dimensionPixelOffset, 0)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
    }
}
