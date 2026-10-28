package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uqj implements Runnable {
    public final /* synthetic */ uql a;
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ vkw c;
    public final /* synthetic */ ListenableFuture d;
    public final /* synthetic */ Bitmap e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ jrr g;
    public final /* synthetic */ yhi h;

    public /* synthetic */ uqj(uql uqlVar, ListenableFuture listenableFuture, vkw vkwVar, ListenableFuture listenableFuture2, Bitmap bitmap, Activity activity, jrr jrrVar, yhi yhiVar) {
        this.a = uqlVar;
        this.b = listenableFuture;
        this.c = vkwVar;
        this.d = listenableFuture2;
        this.e = bitmap;
        this.f = activity;
        this.g = jrrVar;
        this.h = yhiVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, uxi] */
    @Override // java.lang.Runnable
    public final void run() {
        String str = "en";
        ListenableFuture listenableFuture = this.b;
        vkw vkwVar = this.c;
        ListenableFuture listenableFuture2 = this.d;
        Bitmap bitmap = this.e;
        try {
            List list = (List) ahng.v(listenableFuture);
            if (list.isEmpty()) {
                str = "und";
            } else {
                vld vldVar = (vld) list.get(0);
                String str2 = vkwVar.d;
                int i = vla.a;
                int i2 = vlc.a;
                vldVar.getClass();
                str2.getClass();
                String str3 = vldVar.a;
                if (awrc.c(str3, "und")) {
                    str = "und";
                } else if (!awrc.c(str3, "en")) {
                    vlb.a.b(str2);
                    str = str3;
                }
            }
        } catch (ExecutionException e) {
            uql.g("Failure to detect language for text sticker.", e);
            str = null;
        }
        try {
            try {
                vbu vbuVar = (vbu) ahng.v(listenableFuture2);
                Activity activity = this.f;
                bitmap.recycle();
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                jrr jrrVar = this.g;
                String str4 = vkwVar.d;
                jrrVar.copyOnWrite();
                augy augyVar = (augy) jrrVar.instance;
                augy augyVar2 = augy.a;
                str4.getClass();
                augyVar.b |= 2;
                augyVar.f = str4;
                aihf aihfVarCreateBuilder = augu.a.createBuilder();
                String str5 = vbuVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar = (augu) aihfVarCreateBuilder.instance;
                str5.getClass();
                auguVar.b |= 16;
                auguVar.g = str5;
                atzx atzxVar = (atzx) ujq.a.getOrDefault(Integer.valueOf(vkwVar.e), atzx.ALIGN_CENTER);
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar2 = (augu) aihfVarCreateBuilder.instance;
                auguVar2.i = atzxVar.e;
                auguVar2.b |= 64;
                String str6 = vkwVar.d;
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar3 = (augu) aihfVarCreateBuilder.instance;
                str6.getClass();
                auguVar3.b |= 1;
                auguVar3.c = str6;
                float f = vkwVar.f;
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar4 = (augu) aihfVarCreateBuilder.instance;
                auguVar4.b |= 2;
                auguVar4.d = f;
                auir auirVar = vkwVar.b;
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar5 = (augu) aihfVarCreateBuilder.instance;
                auguVar5.h = auirVar.getNumber();
                auguVar5.b |= 32;
                int i3 = vkwVar.j;
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar6 = (augu) aihfVarCreateBuilder.instance;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                auguVar6.j = i4;
                auguVar6.b |= SemanticState.Focused;
                aimw aimwVarC = ujq.c(vkwVar.g);
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar7 = (augu) aihfVarCreateBuilder.instance;
                aimwVarC.getClass();
                auguVar7.e = aimwVarC;
                auguVar7.b |= 4;
                aimw aimwVarC2 = ujq.c(vkwVar.h);
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar8 = (augu) aihfVarCreateBuilder.instance;
                aimwVarC2.getClass();
                auguVar8.f = aimwVarC2;
                auguVar8.b |= 8;
                int i5 = vkwVar.k;
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar9 = (augu) aihfVarCreateBuilder.instance;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                auguVar9.l = i6;
                auguVar9.b |= SemanticState.LiveRegion;
                boolean z = vkwVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                augu auguVar10 = (augu) aihfVarCreateBuilder.instance;
                auguVar10.b |= SemanticState.Hidden;
                auguVar10.k = z;
                if (str != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    augu auguVar11 = (augu) aihfVarCreateBuilder.instance;
                    auguVar11.b |= SemanticState.ReadOnly;
                    auguVar11.m = str;
                }
                yhi yhiVar = this.h;
                uql uqlVar = this.a;
                augu auguVar12 = (augu) aihfVarCreateBuilder.build();
                jrrVar.copyOnWrite();
                augy augyVar3 = (augy) jrrVar.instance;
                auguVar12.getClass();
                augyVar3.d = auguVar12;
                augyVar3.c = 101;
                Optional optionalOf = Optional.of(Long.valueOf(uqlVar.a((augy) jrrVar.build())));
                vkl vklVar = (vkl) yhiVar.a;
                if (nuo.h(vklVar.b)) {
                    Object obj = yhiVar.b;
                    vklVar.f();
                    if (obj != null) {
                        Optional optional = vklVar.N.f.f;
                        uhe uheVar = new uhe(obj, 5);
                        if (true == optional.isPresent()) {
                            ((uql) optional.get()).f.l(new uui(uheVar.a.a(), null));
                        }
                    }
                    if (vklVar.p()) {
                        optionalOf.isPresent();
                        ((Long) optionalOf.get()).longValue();
                    }
                    vklVar.j();
                }
            } catch (ExecutionException e2) {
                uql.g("Failure to save text sticker asset.", e2);
                bitmap.recycle();
            }
        } catch (Throwable th) {
            bitmap.recycle();
            throw th;
        }
    }
}
