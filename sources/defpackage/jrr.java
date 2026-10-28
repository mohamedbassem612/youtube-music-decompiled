package defpackage;

import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class jrr extends aihf implements aiis {
    public jrr() {
        super(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.DEFAULT_INSTANCE);
    }

    public final void a(String str, atpx atpxVar) {
        str.getClass();
        atpxVar.getClass();
        copyOnWrite();
        atpw atpwVar = (atpw) this.instance;
        atpw atpwVar2 = atpw.a;
        aiip aiipVar = atpwVar.c;
        if (!aiipVar.b) {
            atpwVar.c = aiipVar.a();
        }
        atpwVar.c.put(str, atpxVar);
    }

    public final void b(aihf aihfVar) {
        copyOnWrite();
        atsf atsfVar = (atsf) this.instance;
        atsa atsaVar = (atsa) aihfVar.build();
        atsf atsfVar2 = atsf.a;
        atsaVar.getClass();
        atsfVar.a();
        atsfVar.b.add(atsaVar);
    }

    public final void c(atqt atqtVar) {
        copyOnWrite();
        atqs atqsVar = (atqs) this.instance;
        atqs atqsVar2 = atqs.a;
        atqtVar.getClass();
        aiie aiieVar = atqsVar.g;
        if (!aiieVar.c()) {
            atqsVar.g = aihn.mutableCopy(aiieVar);
        }
        atqsVar.g.add(atqtVar);
    }

    public final void d(int i) {
        copyOnWrite();
        axhw axhwVar = (axhw) this.instance;
        axhw axhwVar2 = axhw.a;
        aihv aihvVar = axhwVar.c;
        if (!aihvVar.c()) {
            axhwVar.c = aihn.mutableCopy(aihvVar);
        }
        axhwVar.c.h(i);
    }

    public final void e(int i) {
        copyOnWrite();
        axhw axhwVar = (axhw) this.instance;
        axhw axhwVar2 = axhw.a;
        aihv aihvVar = axhwVar.b;
        if (!aihvVar.c()) {
            axhwVar.b = aihn.mutableCopy(aihvVar);
        }
        axhwVar.b.h(i);
    }

    public final void f(Iterable iterable) {
        copyOnWrite();
        augy augyVar = (augy) this.instance;
        augy augyVar2 = augy.a;
        aiie aiieVar = augyVar.t;
        if (!aiieVar.c()) {
            augyVar.t = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, augyVar.t);
    }

    public final void g(Iterable iterable) {
        copyOnWrite();
        augi augiVar = (augi) this.instance;
        augi augiVar2 = augi.a;
        aiie aiieVar = augiVar.j;
        if (!aiieVar.c()) {
            augiVar.j = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, augiVar.j);
    }

    public jrr(byte[] bArr) {
        super(atpw.a);
    }

    public jrr(byte[] bArr, byte[] bArr2) {
        super(atqs.a);
    }

    public jrr(char[] cArr) {
        super(atsf.a);
    }

    public jrr(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(augi.a);
    }

    public jrr(byte[] bArr, char[] cArr) {
        super(augy.a);
    }

    public jrr(short[] sArr) {
        super(axhw.a);
    }
}
