package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adev extends adhk {
    final /* synthetic */ asnt a;
    final /* synthetic */ nry b;
    final /* synthetic */ nsl c;
    final /* synthetic */ Context d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Executor f;
    final /* synthetic */ Executor g;
    final /* synthetic */ boolean h;
    final /* synthetic */ asnm i;
    final /* synthetic */ boolean j;
    final /* synthetic */ boolean k;
    final /* synthetic */ Optional l;
    final /* synthetic */ String m;
    final /* synthetic */ nxs n;
    final /* synthetic */ nuc o;

    public adev(asnt asntVar, nry nryVar, nsl nslVar, Context context, boolean z, Executor executor, Executor executor2, boolean z2, asnm asnmVar, boolean z3, boolean z4, Optional optional, String str, nxs nxsVar, nuc nucVar) {
        this.a = asntVar;
        this.b = nryVar;
        this.c = nslVar;
        this.d = context;
        this.e = z;
        this.f = executor;
        this.g = executor2;
        this.h = z2;
        this.i = asnmVar;
        this.j = z3;
        this.k = z4;
        this.l = optional;
        this.m = str;
        this.n = nxsVar;
        this.o = nucVar;
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void a(ImageView imageView) {
        if (imageView instanceof adfc) {
            adfc adfcVar = (adfc) imageView;
            asnt asntVar = this.a;
            if ((asntVar.c & SemanticState.Obscured) != 0) {
                nry nryVar = this.b;
                CommandOuterClass$Command defaultInstance = asntVar.n;
                if (defaultInstance == null) {
                    defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                }
                nsl nslVar = this.c;
                nrt nrtVarD = nrv.d();
                nrtVarD.b(nslVar);
                nryVar.a(defaultInstance, nrtVarD.a()).D();
            }
            if ((asntVar.c & 8) != 0) {
                asnm asnmVar = asntVar.g;
                if (asnmVar == null) {
                    asnmVar = asnm.a;
                }
                aecm.I(adfcVar, asnmVar, this.d, this.b, this.e, this.f, this.g, this.h);
            }
            int iBc = a.bc(this.i.d);
            if (iBc == 0) {
                iBc = 1;
            }
            adfcVar.B = iBc;
            if (this.j && this.k) {
                adfcVar.A = true;
            }
            Optional optional = this.l;
            addb addbVar = new addb(this.m, 15);
            if (true == optional.isPresent()) {
                ((xje) optional.get()).b((String) addbVar.a, "img_ls");
            }
        }
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void b(ImageView imageView) {
        if (imageView instanceof adfc) {
            aecm.J((adfc) imageView, this.a);
        }
        if (this.j && this.k) {
            nxs nxsVar = this.n;
            nxsVar.getClass();
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof FrameSequenceDrawable) {
                nxsVar.c((FrameSequenceDrawable) drawable);
            } else if (drawable instanceof fce) {
                nxsVar.d((fce) drawable);
            }
            nxsVar.e();
        }
        Optional optional = this.l;
        addb addbVar = new addb(this.m, 12);
        if (true == optional.isPresent()) {
            ((xje) optional.get()).b((String) addbVar.a, "img_lf");
        }
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void c() {
        addb addbVar = new addb(this.m, 13);
        Optional optional = this.l;
        if (true == optional.isPresent()) {
            ((xje) optional.get()).b((String) addbVar.a, "img_lerr");
        }
        nuc nucVar = this.o;
        nsl nslVar = this.c;
        nucVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "Image zoom load error (Glide) for %s image", true != this.j ? "static" : "animated");
        asnt asntVar = this.a;
        if ((asntVar.c & SemanticState.Modal) != 0) {
            nry nryVar = this.b;
            CommandOuterClass$Command defaultInstance = asntVar.m;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
            nrt nrtVarD = nrv.d();
            nrtVarD.b(nslVar);
            nryVar.a(defaultInstance, nrtVarD.a()).D();
        }
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void d() {
        addb addbVar = new addb(this.m, 14);
        Optional optional = this.l;
        if (true == optional.isPresent()) {
            ((xje) optional.get()).b((String) addbVar.a, "img_lc");
        }
    }
}
