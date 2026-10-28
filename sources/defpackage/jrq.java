package defpackage;

import com.google.android.apps.youtube.proto.streaming.RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jrq extends aihf implements aiis {
    public jrq() {
        super(RequestBandwidthSamplingInfoOuterClass$RequestBandwidthSamplingInfo.DEFAULT_INSTANCE);
    }

    public final void a(String str, int i) {
        str.getClass();
        copyOnWrite();
        atpn atpnVar = (atpn) this.instance;
        atpn atpnVar2 = atpn.a;
        aiip aiipVar = atpnVar.g;
        if (!aiipVar.b) {
            atpnVar.g = aiipVar.a();
        }
        atpnVar.g.put(str, Integer.valueOf(i));
    }

    public final void b(String str, int i) {
        str.getClass();
        copyOnWrite();
        atpn atpnVar = (atpn) this.instance;
        atpn atpnVar2 = atpn.a;
        aiip aiipVar = atpnVar.i;
        if (!aiipVar.b) {
            atpnVar.i = aiipVar.a();
        }
        atpnVar.i.put(str, Integer.valueOf(i));
    }

    public final void c(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        atpn atpnVar = (atpn) this.instance;
        atpn atpnVar2 = atpn.a;
        aiip aiipVar = atpnVar.c;
        if (!aiipVar.b) {
            atpnVar.c = aiipVar.a();
        }
        atpnVar.c.put(str, Boolean.valueOf(z));
    }

    public final void d(String str, int i) {
        str.getClass();
        copyOnWrite();
        atpn atpnVar = (atpn) this.instance;
        atpn atpnVar2 = atpn.a;
        aiip aiipVar = atpnVar.e;
        if (!aiipVar.b) {
            atpnVar.e = aiipVar.a();
        }
        atpnVar.e.put(str, Integer.valueOf(i));
    }

    public final void e(String str, int i) {
        str.getClass();
        copyOnWrite();
        atpn atpnVar = (atpn) this.instance;
        atpn atpnVar2 = atpn.a;
        aiip aiipVar = atpnVar.d;
        if (!aiipVar.b) {
            atpnVar.d = aiipVar.a();
        }
        atpnVar.d.put(str, Integer.valueOf(i));
    }

    public final void f(String str, long j) {
        str.getClass();
        copyOnWrite();
        atpn atpnVar = (atpn) this.instance;
        atpn atpnVar2 = atpn.a;
        aiip aiipVar = atpnVar.f;
        if (!aiipVar.b) {
            atpnVar.f = aiipVar.a();
        }
        atpnVar.f.put(str, Long.valueOf(j));
    }

    public final void g(String str, String str2) {
        copyOnWrite();
        atqr atqrVar = (atqr) this.instance;
        atqr atqrVar2 = atqr.a;
        aiip aiipVar = atqrVar.f;
        if (!aiipVar.b) {
            atqrVar.f = aiipVar.a();
        }
        atqrVar.f.put(str, str2);
    }

    public final void h(long j) {
        copyOnWrite();
        atpx atpxVar = (atpx) this.instance;
        atpx atpxVar2 = atpx.a;
        aihy aihyVar = atpxVar.b;
        if (!aihyVar.c()) {
            atpxVar.b = aihn.mutableCopy(aihyVar);
        }
        atpxVar.b.g(j);
    }

    public final void i(Iterable iterable) {
        copyOnWrite();
        augj augjVar = (augj) this.instance;
        augj augjVar2 = augj.a;
        augjVar.a();
        aifs.addAll(iterable, augjVar.c);
    }

    public final void j(ajai ajaiVar) {
        copyOnWrite();
        aufo aufoVar = (aufo) this.instance;
        aufo aufoVar2 = aufo.a;
        aiie aiieVar = aufoVar.c;
        if (!aiieVar.c()) {
            aufoVar.c = aihn.mutableCopy(aiieVar);
        }
        aufoVar.c.add(ajaiVar);
    }

    public final void k(Iterable iterable) {
        copyOnWrite();
        attx attxVar = (attx) this.instance;
        attx attxVar2 = attx.a;
        aiie aiieVar = attxVar.d;
        if (!aiieVar.c()) {
            attxVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, attxVar.d);
    }

    public final void l(atty attyVar) {
        copyOnWrite();
        atup atupVar = (atup) this.instance;
        atup atupVar2 = atup.a;
        attyVar.getClass();
        atupVar.a();
        atupVar.c.add(attyVar);
    }

    public final void m(atul atulVar) {
        copyOnWrite();
        atup atupVar = (atup) this.instance;
        atup atupVar2 = atup.a;
        atupVar.b();
        atupVar.b.add(atulVar);
    }

    public final void n(aihf aihfVar) {
        copyOnWrite();
        atup atupVar = (atup) this.instance;
        atty attyVar = (atty) aihfVar.build();
        atup atupVar2 = atup.a;
        attyVar.getClass();
        atupVar.a();
        atupVar.c.add(attyVar);
    }

    public final void o(aihf aihfVar) {
        copyOnWrite();
        atup atupVar = (atup) this.instance;
        atul atulVar = (atul) aihfVar.build();
        atup atupVar2 = atup.a;
        atulVar.getClass();
        atupVar.b();
        atupVar.b.add(atulVar);
    }

    public jrq(char[] cArr) {
        super(atpn.a);
    }

    public jrq(byte[] bArr, byte[] bArr2) {
        super(atpx.a);
    }

    public jrq(short[] sArr) {
        super(atqr.a);
    }

    public jrq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(atup.a);
    }

    public jrq(char[] cArr, byte[] bArr) {
        super(attx.a);
    }

    public jrq(byte[] bArr, char[] cArr) {
        super(aufo.a);
    }

    public jrq(int[] iArr) {
        super(augj.a);
    }

    public jrq(byte[] bArr) {
        super(auij.a);
    }
}
