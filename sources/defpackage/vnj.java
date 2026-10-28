package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vnj implements vnh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final tth g;
    private final avmb h;
    private final boolean i;
    private final avlr j;
    private final ahto k;

    public vnj(Context context, avmb avmbVar, ahto ahtoVar, tth tthVar, avlr avlrVar, agev agevVar) {
        this.h = avmbVar;
        this.k = ahtoVar;
        this.g = tthVar;
        this.j = avlrVar;
        this.f = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
        this.i = twm.v(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        this.a = (int) (((double) (displayMetrics.density * 400.0f)) + 0.5d);
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        this.b = (int) (((double) (displayMetrics2.density * 768.0f)) + 0.5d);
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        this.c = (int) (((double) (displayMetrics3.density * 360.0f)) + 0.5d);
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        displayMetrics4.getClass();
        this.d = (int) (((double) (displayMetrics4.density * 528.0f)) + 0.5d);
        DisplayMetrics displayMetrics5 = context.getResources().getDisplayMetrics();
        displayMetrics5.getClass();
        this.e = (int) (((double) (displayMetrics5.density * 24.0f)) + 0.5d);
    }

    public static avw b(RelativeLayout relativeLayout) {
        avw avwVar = (avw) relativeLayout.getTag(R.id.original_padding_tag);
        if (avwVar != null) {
            return avwVar;
        }
        avw avwVarD = avw.d(relativeLayout.getPaddingStart(), relativeLayout.getPaddingTop(), relativeLayout.getPaddingEnd(), relativeLayout.getPaddingBottom());
        relativeLayout.setTag(R.id.original_padding_tag, avwVarD);
        return avwVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vnh
    public final avmn[] a(RelativeLayout relativeLayout, View view, avlr avlrVar) {
        view.getClass();
        awbl awblVar = new awbl(new tdu(view, 2));
        avnn avnnVar = atqp.l;
        avmb avmbVar = this.h;
        avlr avlrVarR = awblVar.W(avmbVar).r();
        avla avlaVar = avla.e;
        avlh avlhVarG = avlrVarR.g(avlaVar);
        tfk tfkVar = new tfk(5);
        avlr avlrVar2 = this.j;
        avlh avlhVarG2 = avlrVar2.K(tfkVar).r().g(avlaVar);
        jna jnaVar = new jna(12);
        Object obj = this.k.b;
        avlh avlhVarP = avlh.f(avlhVarG2, ((avlh) obj).x(jnaVar).H(new tfk(6)), new idi(3)).U(17).p();
        Object objV = this.f ? tuk.v(relativeLayout, false) : this.g.a;
        avlh avlhVarG3 = avlrVar2.K(new tfk(4)).V(Boolean.valueOf(this.i)).r().g(avlaVar);
        avlh avlhVarG4 = avlrVar.r().g(avlaVar);
        obj.getClass();
        avny avnyVar = new avny();
        axso[] axsoVarArr = {obj, avlhVarG, avlhVarP, objV, avlhVarG3, avlhVarG4};
        int i = avlh.a;
        avoj.a(i, "bufferSize");
        avrz avrzVar = new avrz(axsoVarArr, avnyVar, i);
        avnn avnnVar2 = atqp.j;
        b(relativeLayout);
        return new avmn[]{avrzVar.x(new jna(13)).L(avmbVar).ak(new jbq(this, relativeLayout, 4, null))};
    }
}
