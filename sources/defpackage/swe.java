package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class swe {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public swe(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.header);
        this.c = (TextView) view.findViewById(R.id.sub_header);
        this.d = (TextView) view.findViewById(R.id.description);
        this.e = (TextView) view.findViewById(R.id.details);
        this.f = (TextView) view.findViewById(R.id.extended_description);
        this.g = (ImageView) view.findViewById(R.id.image);
        this.h = (FixedAspectRatioFrameLayout) view.findViewById(R.id.image_container);
    }

    public final void a(int i) {
        acb acbVarD = d();
        acbVarD.a = i;
        xeu xeuVar = (xeu) this.b;
        if (!xeuVar.b) {
            xeuVar.b(acbVarD.h());
            return;
        }
        xff xffVarA = xeuVar.a(acbVarD.o(), alot.TRANSACTION_FLOW_FAILED);
        ztf ztfVar = xffVarA.k.e;
        xffVarA.l = ztfVar.a();
        ztfVar.k(xffVarA);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, zwb] */
    public final void b(vyq vyqVar, byte[] bArr, byte[] bArr2) {
        int i = vyqVar != vyq.PRODUCTION ? 0 : 1;
        Object obj = this.g;
        lrq lrqVar = (lrq) obj;
        lrqVar.d(i);
        ((lsb) obj).a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
        lrqVar.b(((omj) this.d).N(this.b.e()));
        lrqVar.e();
        lrx lrxVar = new lrx();
        lrxVar.a();
        lrqVar.c(lrxVar);
        Intent intentA = lrqVar.a();
        c(bArr2, 2);
        ((mgk) this.c).b(intentA, 1900, new sty(this, bArr2));
    }

    public final void c(byte[] bArr, int i) {
        aihf aihfVarCreateBuilder = aroa.a.createBuilder();
        aigj aigjVarV = aigj.v(bArr);
        aihfVarCreateBuilder.copyOnWrite();
        aroa aroaVar = (aroa) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        aroaVar.b |= 2;
        aroaVar.d = aigjVarV;
        aihfVarCreateBuilder.copyOnWrite();
        aroa aroaVar2 = (aroa) aihfVarCreateBuilder.instance;
        aroaVar2.c = i - 1;
        aroaVar2.b |= 1;
        xeu xeuVar = (xeu) this.e;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.FIX_FOP_FLOW);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aroa aroaVar3 = (aroa) aihfVarCreateBuilder.build();
        aroaVar3.getClass();
        alouVar.d = aroaVar3;
        alouVar.c = 159;
        xeuVar.b((alou) alosVar.build());
    }

    public final acb d() {
        aigj aigjVar = ((arox) this.h).f;
        acb acbVar = new acb((char[]) null);
        if (!aigjVar.E()) {
            acbVar.d = aigjVar;
        }
        return acbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [awmd, java.lang.Object] */
    public final qbk e(qbh qbhVar, String str, int i) {
        Context context = (Context) this.b.io();
        context.getClass();
        awou awouVar = (awou) this.d.io();
        awouVar.getClass();
        awou awouVar2 = (awou) this.e.io();
        awouVar2.getClass();
        ((pav) this.f.io()).getClass();
        pxh pxhVar = (pxh) this.a.io();
        pxhVar.getClass();
        pwf pwfVar = (pwf) this.g.io();
        pwfVar.getClass();
        ijt ijtVar = (ijt) this.h.io();
        ijtVar.getClass();
        pls plsVar = (pls) this.c.io();
        plsVar.getClass();
        return new qbk(context, awouVar, awouVar2, pxhVar, pwfVar, ijtVar, plsVar, qbhVar, str, i);
    }

    public swe(ttm ttmVar, xeu xeuVar, vxe vxeVar, suw suwVar, arox aroxVar, vwt vwtVar, sud sudVar, xgn xgnVar) {
        this.e = ttmVar;
        this.b = xeuVar;
        this.f = vxeVar;
        this.g = suwVar;
        this.h = aroxVar;
        this.d = vwtVar;
        this.a = sudVar;
        this.c = xgnVar;
    }

    public swe(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.e = awmdVar3;
        awmdVar4.getClass();
        this.f = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.h = awmdVar7;
        awmdVar8.getClass();
        this.c = awmdVar8;
    }

    public swe(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.g = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.h = awmdVar5;
        this.f = awmdVar6;
        this.e = awmdVar7;
        this.a = awmdVar8;
    }

    public swe(cf cfVar, mgk mgkVar, awmd awmdVar, omj omjVar, zwb zwbVar, Context context, xeu xeuVar) {
        this.h = cfVar;
        this.c = mgkVar;
        this.a = awmdVar;
        this.d = omjVar;
        this.b = zwbVar;
        this.g = new lsb(context);
        this.e = xeuVar;
        this.f = new HashSet();
    }
}
