package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijy implements sxu {
    final /* synthetic */ xgn a;
    final /* synthetic */ ahgb b;

    public ijy(ahgb ahgbVar, xgn xgnVar) {
        this.a = xgnVar;
        this.b = ahgbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        alwn alwnVar = (alwn) obj2;
        final ahgb ahgbVar = this.b;
        iix iixVar = (iix) ahgbVar.b.io();
        aihf aihfVarCreateBuilder = alwm.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alwm alwmVar = (alwm) aihfVarCreateBuilder.instance;
        alwnVar.getClass();
        aiie aiieVar = alwmVar.d;
        if (!aiieVar.c()) {
            alwmVar.d = aihn.mutableCopy(aiieVar);
        }
        alwmVar.d.add(alwnVar);
        iixVar.a((alwm) aihfVarCreateBuilder.build(), this.a, new iiw() { // from class: ijx
            @Override // defpackage.iiw
            public final ListenableFuture a(aosu aosuVar) {
                ArrayList arrayList = new ArrayList();
                ajwo ajwoVar = aosuVar.h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apzb.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                for (apyx apyxVar : ((apzb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e) {
                    int i = apyxVar.b;
                    if (i == 1) {
                        arrayList.add((i == 1 ? (apyv) apyxVar.c : apyv.a).c);
                    }
                }
                ahgb ahgbVar2 = ahgbVar;
                String str = aosuVar.c;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = Uri.parse((String) it.next());
                    if (ish.q.match(uri) == 1) {
                        arrayList2.add(uri);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return ahng.n(aost.NONE);
                }
                return ((itu) ahgbVar2.e).c.v(Uri.parse(str), arrayList2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ttm] */
    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        ahgb ahgbVar = this.b;
        ?? r4 = ahgbVar.a;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(r4.b(exc));
        ((jin) ahgbVar.c).d(jioVarE.b());
        ((tbt) ahgbVar.d).c(new haz(false, r4.b(exc)));
    }
}
