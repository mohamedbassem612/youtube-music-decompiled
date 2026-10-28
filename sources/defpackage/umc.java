package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.Size;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class umc implements Consumer {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ vkw c;
    public final /* synthetic */ Optional d;
    public final /* synthetic */ Optional e;
    public final /* synthetic */ Optional f;
    public final /* synthetic */ Optional g;
    public final /* synthetic */ yhi h;

    public /* synthetic */ umc(Activity activity, Bitmap bitmap, vkw vkwVar, Optional optional, yhi yhiVar, Optional optional2, Optional optional3, Optional optional4) {
        this.a = activity;
        this.b = bitmap;
        this.c = vkwVar;
        this.d = optional;
        this.h = yhiVar;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        jrr jrrVar;
        auho auhoVar;
        uql uqlVar = (uql) obj;
        Bitmap bitmap = this.b;
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        auho auhoVarB = uqlVar.b(size);
        Optional optional = this.g;
        optional.isPresent();
        auho auhoVar2 = (auho) optional.orElse(auhoVarB);
        vkw vkwVar = this.c;
        uxi uxiVar = vkwVar.a;
        int i = 2;
        if (uxiVar == null) {
            Optional optional2 = this.f;
            Optional optionalOfNullable = this.d;
            jrrVar = (jrr) augy.a.createBuilder();
            optional2.isPresent();
            aigu aiguVar = aikw.a;
            jrrVar.copyOnWrite();
            augy augyVar = (augy) jrrVar.instance;
            aiguVar.getClass();
            augyVar.i = aiguVar;
            augyVar.b |= 16;
            optional2.isPresent();
            aigu aiguVarAu = ahng.au(uqlVar.f.d());
            jrrVar.copyOnWrite();
            augy augyVar2 = (augy) jrrVar.instance;
            aiguVarAu.getClass();
            augyVar2.j = aiguVarAu;
            augyVar2.b |= 32;
            optional.isPresent();
            if (true == optionalOfNullable.isPresent()) {
                Object obj2 = optionalOfNullable.get();
                aihf aihfVarCreateBuilder = auhp.a.createBuilder();
                PointF pointF = (PointF) obj2;
                float f = pointF.x;
                aihfVarCreateBuilder.copyOnWrite();
                auhp auhpVar = (auhp) aihfVarCreateBuilder.instance;
                auhpVar.b |= 1;
                auhpVar.c = f;
                float f2 = pointF.y;
                aihfVarCreateBuilder.copyOnWrite();
                auhp auhpVar2 = (auhp) aihfVarCreateBuilder.instance;
                auhpVar2.b |= 2;
                auhpVar2.d = f2;
                optionalOfNullable = Optional.ofNullable((auhp) aihfVarCreateBuilder.build());
            }
            Optional optional3 = this.e;
            auhp auhpVar3 = (auhp) optionalOfNullable.orElse(uql.b);
            jrrVar.copyOnWrite();
            augy augyVar3 = (augy) jrrVar.instance;
            auhpVar3.getClass();
            augyVar3.k = auhpVar3;
            augyVar3.b |= 64;
            jrrVar.copyOnWrite();
            augy augyVar4 = (augy) jrrVar.instance;
            auhoVar2.getClass();
            augyVar4.l = auhoVar2;
            augyVar4.b |= SemanticState.Focused;
            optional.isPresent();
            jrrVar.copyOnWrite();
            augy augyVar5 = (augy) jrrVar.instance;
            augyVar5.b |= SemanticState.ReadOnly;
            augyVar5.o = 0.0d;
            aihf aihfVarCreateBuilder2 = auhn.a.createBuilder();
            int width = size.getWidth();
            aihfVarCreateBuilder2.copyOnWrite();
            auhn auhnVar = (auhn) aihfVarCreateBuilder2.instance;
            auhnVar.b |= 1;
            auhnVar.c = width;
            int height = size.getHeight();
            aihfVarCreateBuilder2.copyOnWrite();
            auhn auhnVar2 = (auhn) aihfVarCreateBuilder2.instance;
            auhnVar2.b |= 2;
            auhnVar2.d = height;
            jrrVar.copyOnWrite();
            augy augyVar6 = (augy) jrrVar.instance;
            auhn auhnVar3 = (auhn) aihfVarCreateBuilder2.build();
            auhnVar3.getClass();
            augyVar6.r = auhnVar3;
            augyVar6.b |= SemanticState.Obscured;
            optional3.isPresent();
        } else {
            augy augyVar7 = ((uxk) uxiVar).a;
            jrrVar = (jrr) augyVar7.toBuilder();
            augu auguVar = augyVar7.c == 101 ? (augu) augyVar7.d : augu.a;
            auhn auhnVar4 = auhn.a;
            aihf aihfVarCreateBuilder3 = auhnVar4.createBuilder();
            int width2 = size.getWidth();
            aihfVarCreateBuilder3.copyOnWrite();
            auhn auhnVar5 = (auhn) aihfVarCreateBuilder3.instance;
            auhnVar5.b |= 1;
            auhnVar5.c = width2;
            int height2 = size.getHeight();
            aihfVarCreateBuilder3.copyOnWrite();
            auhn auhnVar6 = (auhn) aihfVarCreateBuilder3.instance;
            auhnVar6.b |= 2;
            auhnVar6.d = height2;
            auhn auhnVar7 = (auhn) aihfVarCreateBuilder3.build();
            agrf agrfVar = usj.a;
            if ((augyVar7.b & SemanticState.Focused) != 0) {
                auhoVar = augyVar7.l;
                if (auhoVar == null) {
                    auhoVar = auho.a;
                }
            } else {
                auhoVar = usj.b;
            }
            jrrVar.copyOnWrite();
            augy augyVar8 = (augy) jrrVar.instance;
            auhoVar.getClass();
            augyVar8.l = auhoVar;
            augyVar8.b |= SemanticState.Focused;
            jrrVar.copyOnWrite();
            augy augyVar9 = (augy) jrrVar.instance;
            auhnVar7.getClass();
            augyVar9.r = auhnVar7;
            augyVar9.b |= SemanticState.Obscured;
            if ((augyVar7.b & SemanticState.Obscured) != 0) {
                auhn auhnVar8 = augyVar7.r;
                if (auhnVar8 == null) {
                    auhnVar8 = auhnVar4;
                }
                if (!auhnVar8.equals(auhnVar7)) {
                    auhn auhnVar9 = augyVar7.r;
                    if (auhnVar9 != null) {
                        auhnVar4 = auhnVar9;
                    }
                    auho auhoVarC = uqlVar.c(auhnVar4, auhnVar7, auhoVar);
                    jrrVar.copyOnWrite();
                    augy augyVar10 = (augy) jrrVar.instance;
                    auhoVarC.getClass();
                    augyVar10.l = auhoVarC;
                    augyVar10.b |= SemanticState.Focused;
                }
            }
            if (auguVar.d != vkwVar.f) {
                auho auhoVarB2 = uqlVar.b(size);
                jrrVar.copyOnWrite();
                augy augyVar11 = (augy) jrrVar.instance;
                auhoVarB2.getClass();
                augyVar11.l = auhoVarB2;
                augyVar11.b |= SemanticState.Focused;
            }
        }
        jrr jrrVar2 = jrrVar;
        yhi yhiVar = this.h;
        Activity activity = this.a;
        vlc vlcVar = (vlc) uqlVar.c.io();
        String str = vkwVar.d;
        ahey aheyVar = uqlVar.e;
        ListenableFuture listenableFutureA = vlcVar.a(str);
        ListenableFuture listenableFutureF = ape.f(new dzx(uqlVar, bitmap, 3, null));
        ahud ahudVarAv = ahno.av(listenableFutureA, listenableFutureF);
        uqj uqjVar = new uqj(uqlVar, listenableFutureA, vkwVar, listenableFutureF, bitmap, activity, jrrVar2, yhiVar);
        Executor executor = uqlVar.h;
        taf.i(ahudVarAv.m(uqjVar, executor), executor, new tsq(i), new uqk(0), null);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
