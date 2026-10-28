package defpackage;

import android.view.MotionEvent;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vwh implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vwh(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, vxc] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$cid) {
            case 0:
                Object obj = this.c;
                Object obj2 = this.b;
                Object obj3 = this.a;
                synchronized (obj3) {
                    ((vwi) obj3).a.h((String) obj2, (tmr) obj);
                    break;
                }
                return;
            case 1:
                Object obj4 = this.b;
                Object obj5 = this.c;
                Object obj6 = this.a;
                try {
                    ((vwd) obj6).g();
                    ((vwd) obj6).j.p((String) obj4).q((MotionEvent) obj5);
                    return;
                } finally {
                    ((MotionEvent) obj5).recycle();
                }
            case 2:
                ((vwu) this.c).g((ajwo) this.a, this.b);
                return;
            case 3:
                vwy.g(this.c, (ajwo) this.a, this.b);
                return;
            case 4:
                amrb amrbVar = (amrb) this.a;
                int i = amrbVar.b;
                Object obj7 = this.b;
                Object obj8 = this.c;
                if (i == 132600952) {
                    ((wyq) obj8).q((amrc) amrbVar.c, (Duration) obj7);
                    return;
                } else if (i == 132600924) {
                    ((wyq) obj8).q((amrd) amrbVar.c, (Duration) obj7);
                    return;
                } else {
                    if (i == 201730354) {
                        ((wyq) obj8).q((amra) amrbVar.c, (Duration) obj7);
                        return;
                    }
                    return;
                }
            case 5:
                Object obj9 = this.b;
                aefv aefvVar = ((xbs) this.c).c;
                aefk aefkVarM = aefvVar.m((aqof) obj9);
                aefkVarM.a = ((xcb) this.a).x();
                aefkVarM.m();
                aefvVar.c(aefkVarM.c());
                return;
            case 6:
                alos alosVar = (alos) alou.a.createBuilder();
                xef xefVar = (xef) this.c;
                ajtx ajtxVarB = ((zvk) this.b).b(xefVar.d, xefVar.a);
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVarB.build();
                clientErrorOuterClass$ClientError.getClass();
                alouVar.d = clientErrorOuterClass$ClientError;
                alouVar.c = 163;
                ((wjr) xefVar.b.io()).A(alosVar, (xie) this.a);
                return;
            case 7:
                Object obj10 = this.b;
                ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) obj10;
                ClientErrorOuterClass$LogMessage defaultInstance = clientErrorOuterClass$ClientError2.e;
                if (defaultInstance == null) {
                    defaultInstance = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                }
                Object obj11 = this.c;
                if ((defaultInstance.b & 16) == 0) {
                    ajtx ajtxVar = (ajtx) ((aihn) obj10).toBuilder();
                    ClientErrorOuterClass$LogMessage defaultInstance2 = clientErrorOuterClass$ClientError2.e;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                    }
                    aihf builder = defaultInstance2.toBuilder();
                    int i2 = ((xef) obj11).d;
                    builder.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = (ClientErrorOuterClass$LogMessage) builder.instance;
                    clientErrorOuterClass$LogMessage.b |= 16;
                    clientErrorOuterClass$LogMessage.f = i2;
                    ajtxVar.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError3 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage2 = (ClientErrorOuterClass$LogMessage) builder.build();
                    clientErrorOuterClass$LogMessage2.getClass();
                    clientErrorOuterClass$ClientError3.e = clientErrorOuterClass$LogMessage2;
                    clientErrorOuterClass$ClientError3.b |= 4;
                    obj10 = (ClientErrorOuterClass$ClientError) ajtxVar.build();
                }
                Object obj12 = this.a;
                alos alosVar2 = (alos) alou.a.createBuilder();
                alosVar2.copyOnWrite();
                alou alouVar2 = (alou) alosVar2.instance;
                obj10.getClass();
                alouVar2.d = obj10;
                alouVar2.c = 163;
                ((wjr) ((xef) obj11).b.io()).A(alosVar2, (xie) obj12);
                return;
            case 8:
                ((wjr) ((xei) this.c).a.io()).A((alos) ((aihn) this.b).toBuilder(), (xie) this.a);
                return;
            case 9:
                ((wjr) ((xei) this.c).a.io()).A((alos) ((aihn) this.b).toBuilder(), (xie) this.a);
                return;
            case 10:
                ((wjr) ((xei) this.c).a.io()).A((alos) ((aihn) this.b).toBuilder(), (xie) this.a);
                return;
            case 11:
                ((wjr) ((xei) this.c).a.io()).A((alos) ((aihn) this.b).toBuilder(), (xie) this.a);
                return;
            case 12:
                ((wjr) ((xei) this.c).a.io()).A((alos) ((aihn) this.b).toBuilder(), (xie) this.a);
                return;
            case 13:
                ArrayList arrayList = new ArrayList(Arrays.asList((aihf) this.a));
                xfc xfcVar = (xfc) this.c;
                xfcVar.e.j(xfcVar.g, arrayList, (Throwable) this.b);
                return;
            case 14:
                xfc xfcVar2 = (xfc) this.c;
                yno.dt(xfcVar2.c, xfcVar2.d, xfcVar2.b, (alox) this.b, this.a);
                return;
            case 15:
                xhw xhwVar = (xhw) this.a;
                xhwVar.a.g(xhwVar.b, ((xgj) this.c).a, (xie) this.b);
                return;
            case 16:
                awmd awmdVar = ((xip) this.a).a;
                xja xjaVar = (xja) awmdVar.io();
                Object obj13 = this.c;
                Object obj14 = this.b;
                String str = (String) obj14;
                xie xieVar = (xie) obj13;
                xjaVar.b(str, xieVar);
                xja xjaVar2 = (xja) awmdVar.io();
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.f = 47;
                amiuVar.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
                obj14.getClass();
                amiuVar2.b |= 8;
                amiuVar2.g = str;
                xjaVar2.a((amiu) aihfVarCreateBuilder.build(), xieVar);
                return;
            case 17:
                ((xja) ((xip) this.a).a.io()).a((amiu) this.b, (xie) this.c);
                return;
            case 18:
                Object obj15 = this.b;
                Optional.of(obj15);
                aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amiu amiuVar3 = (amiu) aihfVarCreateBuilder2.instance;
                amiuVar3.b |= 8;
                xiv xivVar = (xiv) this.a;
                amiuVar3.g = xivVar.d;
                aihfVarCreateBuilder2.copyOnWrite();
                amiu amiuVar4 = (amiu) aihfVarCreateBuilder2.instance;
                amiuVar4.f = xivVar.h - 1;
                amiuVar4.b |= 4;
                aihfVarCreateBuilder2.copyOnWrite();
                amiu amiuVar5 = (amiu) aihfVarCreateBuilder2.instance;
                obj15.getClass();
                amiuVar5.b |= 16;
                amiuVar5.h = (String) obj15;
                xivVar.c.a((amiu) aihfVarCreateBuilder2.build(), (xie) this.c);
                xivVar.a.isPresent();
                return;
            case 19:
                Object obj16 = this.a;
                Object obj17 = this.c;
                xiu xiuVar = (xiu) obj17;
                hmr hmrVar = new hmr((xiv) obj16, (aftj) this.b, xiuVar, 5);
                Optional optional = xiuVar.a;
                if (true == optional.isPresent()) {
                    Object obj18 = optional.get();
                    Object obj19 = hmrVar.b;
                    Object obj20 = hmrVar.c;
                    Object obj21 = hmrVar.a;
                    aftj aftjVar = (aftj) obj20;
                    aftjVar.g((String) obj18);
                    ((xiv) obj19).c.c(aftjVar.e(), ((xiu) obj21).c);
                }
                Optional optional2 = xiuVar.b;
                sda sdaVar = new sda(obj16, obj17, 19, null);
                if (true == optional2.isPresent()) {
                    ((xiv) sdaVar.b).c.a((amiu) optional2.get(), ((xiu) sdaVar.a).c);
                    return;
                }
                return;
            default:
                aihf builder2 = ((aihn) this.b).toBuilder();
                builder2.copyOnWrite();
                amiu amiuVar6 = (amiu) builder2.instance;
                amiuVar6.b |= 8;
                xiv xivVar2 = (xiv) this.a;
                amiuVar6.g = xivVar2.d;
                amiu amiuVar7 = (amiu) builder2.build();
                boolean z = xivVar2.e;
                Object obj22 = this.c;
                if (z) {
                    xivVar2.c.a(amiuVar7, (xie) obj22);
                    xivVar2.a.isPresent();
                    return;
                } else {
                    ArrayList arrayList2 = xivVar2.f;
                    Optional optionalEmpty = Optional.empty();
                    Optional.empty();
                    arrayList2.add(new xiu(optionalEmpty, Optional.of(amiuVar7), (xie) obj22));
                    return;
                }
        }
    }

    public /* synthetic */ vwh(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ vwh(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ vwh(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
