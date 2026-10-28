package defpackage;

import app.rive.FontAsset;
import app.rive.RiveFile;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adpe extends awpk implements awqk {
    final /* synthetic */ RiveFile a;
    final /* synthetic */ adpi b;
    final /* synthetic */ long c;
    final /* synthetic */ String d;
    final /* synthetic */ FontAsset e;
    final /* synthetic */ awrm f;
    final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpe(RiveFile riveFile, adpi adpiVar, long j, String str, FontAsset fontAsset, awrm awrmVar, Function0 function0, awoq awoqVar) {
        super(2, awoqVar);
        this.a = riveFile;
        this.b = adpiVar;
        this.c = j;
        this.d = str;
        this.e = fontAsset;
        this.f = awrmVar;
        this.g = function0;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new adpe(this.a, this.b, this.c, this.d, this.e, this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adpe) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        RiveFile riveFile = this.a;
        adpi adpiVar = this.b;
        if (riveFile == adpiVar.f) {
            AtomicLong atomicLong = adpiVar.g;
            long j = atomicLong.get();
            long j2 = this.c;
            if (j == j2) {
                String str = this.d;
                FontAsset fontAsset = this.e;
                str.getClass();
                ConcurrentHashMap concurrentHashMap = adpiVar.e;
                synchronized (concurrentHashMap) {
                    if (atomicLong.get() == j2 && adpiVar.f != null) {
                        fontAsset = (FontAsset) concurrentHashMap.put(str, fontAsset);
                    }
                }
                if (fontAsset != null) {
                    adpiVar.e(str, fontAsset);
                }
                this.f.a = null;
                awqk awqkVar = this.b.h;
                if (awqkVar != null) {
                    awqkVar.invoke(this.d, this.e);
                }
                Function0 function0 = this.g;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        return awmy.a;
    }
}
