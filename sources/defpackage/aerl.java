package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerl {
    public final mbc a;
    public final aero b;
    public final awmd c;
    public final akmm d;
    public final boolean e;
    private final ahey f;
    private ListenableFuture g;
    private aihf h;
    private final aero i;

    public aerl(mbc mbcVar, aero aeroVar, awmd awmdVar, ahey aheyVar, akmm akmmVar, aero aeroVar2) {
        this.a = mbcVar;
        this.b = aeroVar;
        this.c = awmdVar;
        this.f = aheyVar;
        this.d = akmmVar;
        this.i = aeroVar2;
        boolean z = false;
        if (aeroVar2.a != 0 && afba.W(1000) < aeroVar2.a) {
            z = true;
        }
        this.e = z;
    }

    public final synchronized void a() {
        if (this.h != null) {
            this.d.name();
            ListenableFuture listenableFuture = this.g;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
        }
    }

    public final synchronized void b() {
        if (this.h == null || this.g == null) {
            return;
        }
        this.d.name();
        long millis = this.a.e().toMillis();
        aihf aihfVar = this.h;
        long j = millis - ((aqid) aihfVar.instance).e;
        aihfVar.copyOnWrite();
        aqid aqidVar = (aqid) aihfVar.instance;
        aqidVar.b |= 4;
        aqidVar.e = j;
        ListenableFuture listenableFutureN = ahng.n(this.h);
        ListenableFuture listenableFuture = this.g;
        if (listenableFuture instanceof ahew) {
            ahew ahewVar = (ahew) listenableFuture;
            if (ahewVar.getDelay(TimeUnit.MILLISECONDS) > 0) {
                ahewVar.cancel(false);
            }
        }
        ListenableFuture listenableFuture2 = this.g;
        ahek ahekVarH = ahng.h(listenableFutureN, listenableFuture2);
        aalq aalqVar = new aalq(listenableFutureN, listenableFuture2, 17);
        ahey aheyVar = this.f;
        ahng.x(ahekVarH.a(aalqVar, aheyVar), new ryh(this, 12), aheyVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:9:0x001e, B:19:0x005e, B:21:0x0062, B:22:0x006a, B:10:0x0021, B:11:0x0035, B:13:0x0040, B:15:0x004d, B:16:0x0058, B:17:0x005b), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:9:0x001e, B:19:0x005e, B:21:0x0062, B:22:0x006a, B:10:0x0021, B:11:0x0035, B:13:0x0040, B:15:0x004d, B:16:0x0058, B:17:0x005b), top: B:37:0x0001 }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void c() {
        aern aernVar;
        aern aernVar2;
        aerl aerlVar;
        ListenableFuture listenableFutureSchedule;
        try {
            try {
                if (this.h == null && this.e) {
                    akmm akmmVar = this.d;
                    akmmVar.name();
                    long millis = this.a.e().toMillis();
                    aero aeroVar = this.i;
                    Object obj = aeroVar.b;
                    if (obj != null) {
                        int i = ((aerm) obj).b;
                        int iW = afba.W(i);
                        int i2 = ((aerm) obj).a;
                        int iW2 = afba.W(i2);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            ?? r11 = ((aerm) obj).c;
                            if (i3 < r11.size()) {
                                int iIntValue = ((Integer) r11.get(i3)).intValue();
                                i4 += iIntValue;
                                if (iW < i4) {
                                    aernVar2 = new aern(iIntValue / i, (i2 * i3) + iW2);
                                    break;
                                }
                                i3++;
                            } else {
                                aernVar = aern.a;
                            }
                        }
                        if (aernVar2 == aern.a) {
                            listenableFutureSchedule = ahng.n(aqic.a);
                            aerlVar = this;
                        } else {
                            aerlVar = this;
                            listenableFutureSchedule = this.f.schedule(new acql(aerlVar, aernVar2, millis, 3), aernVar2.c, TimeUnit.MILLISECONDS);
                        }
                        aerlVar.g = listenableFutureSchedule;
                        aihf aihfVarCreateBuilder = aqid.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aqid aqidVar = (aqid) aihfVarCreateBuilder.instance;
                        aqidVar.c = akmmVar.t;
                        aqidVar.b |= 1;
                        int i5 = aeroVar.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        aqid aqidVar2 = (aqid) aihfVarCreateBuilder.instance;
                        aqidVar2.b |= 2;
                        aqidVar2.d = i5 / 1000.0f;
                        aihfVarCreateBuilder.copyOnWrite();
                        aqid aqidVar3 = (aqid) aihfVarCreateBuilder.instance;
                        aqidVar3.b |= 4;
                        aqidVar3.e = millis;
                        aerlVar.h = aihfVarCreateBuilder;
                    }
                    aernVar = aern.a;
                    aernVar2 = aernVar;
                    if (aernVar2 == aern.a) {
                        listenableFutureSchedule = ahng.n(aqic.a);
                        aerlVar = this;
                    } else {
                        aerlVar = this;
                        listenableFutureSchedule = this.f.schedule(new acql(aerlVar, aernVar2, millis, 3), aernVar2.c, TimeUnit.MILLISECONDS);
                    }
                    aerlVar.g = listenableFutureSchedule;
                    aihf aihfVarCreateBuilder2 = aqid.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aqid aqidVar4 = (aqid) aihfVarCreateBuilder2.instance;
                    aqidVar4.c = akmmVar.t;
                    aqidVar4.b |= 1;
                    int i6 = aeroVar.a;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aqid aqidVar5 = (aqid) aihfVarCreateBuilder2.instance;
                    aqidVar5.b |= 2;
                    aqidVar5.d = i6 / 1000.0f;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aqid aqidVar6 = (aqid) aihfVarCreateBuilder2.instance;
                    aqidVar6.b |= 4;
                    aqidVar6.e = millis;
                    aerlVar.h = aihfVarCreateBuilder2;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
