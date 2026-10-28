package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cpy extends cav implements Handler.Callback {
    private long A;
    private final cch B;
    public long k;
    private final DecoderInputBuffer l;
    private cps m;
    private final cpx n;
    private boolean o;
    private int p;
    private dbe q;
    private dbi r;
    private dbj s;
    private dbj t;
    private int u;
    private final Handler v;
    private final ccu w;
    private boolean x;
    private boolean y;
    private bse z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpy(cch cchVar, Looper looper) {
        Handler handler;
        super(3);
        cpx cpxVar = cpx.b;
        cchVar.getClass();
        this.B = cchVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = bwp.a;
            handler = new Handler(looper, this);
        }
        this.v = handler;
        this.n = cpxVar;
        this.l = new DecoderInputBuffer(1);
        this.w = new ccu();
        this.k = -9223372036854775807L;
        this.A = -9223372036854775807L;
    }

    private final long a() {
        int i = this.u;
        if (i != -1) {
            dbj dbjVar = this.s;
            dbjVar.getClass();
            if (i < dbjVar.a()) {
                return this.s.c(this.u);
            }
        }
        return Long.MAX_VALUE;
    }

    private final void ai() {
        this.r = null;
        this.u = -1;
        dbj dbjVar = this.s;
        if (dbjVar != null) {
            dbjVar.release();
            this.s = null;
        }
        dbj dbjVar2 = this.t;
        if (dbjVar2 != null) {
            dbjVar2.release();
            this.t = null;
        }
    }

    private final void aj() {
        ai();
        dbe dbeVar = this.q;
        dbeVar.getClass();
        dbeVar.release();
        this.q = null;
        this.p = 0;
    }

    private final void ak() {
        aj();
        g();
    }

    private final void al(but butVar) {
        Handler handler = this.v;
        if (handler != null) {
            handler.obtainMessage(1, butVar).sendToTarget();
        } else {
            h(butVar);
        }
    }

    private static boolean am(dbd dbdVar, long j) {
        return dbdVar != null && dbdVar.a() > 0 && dbdVar.c(dbdVar.a() + (-1)) > j;
    }

    private static boolean an(bse bseVar) {
        return Objects.equals(bseVar.q, "application/x-media3-cues");
    }

    private final void b() {
        boolean z = true;
        if (!Objects.equals(this.z.q, "application/cea-608") && !Objects.equals(this.z.q, "application/x-mp4-cea-608") && !Objects.equals(this.z.q, "application/cea-708")) {
            z = false;
        }
        ahno.U(z, "Legacy decoding is disabled, can't handle %s samples (expected %s).", this.z.q, "application/x-media3-cues");
    }

    private final void d() {
        agke agkeVar = agpi.a;
        ahno.O(this.A != -9223372036854775807L);
        al(new but(agkeVar));
    }

    private final void e(dbf dbfVar) {
        bvx.d("TextRenderer", "Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.z))), dbfVar);
        d();
        ak();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    private final void g() {
        dbk dbkVar;
        dbe dbcVar;
        this.o = true;
        bse bseVar = this.z;
        bseVar.getClass();
        String str = bseVar.q;
        if (str == null) {
            dbkVar = ((cpw) this.n).a;
            if (!dbkVar.c(bseVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(str)));
            }
            dbn dbnVarB = dbkVar.b(bseVar);
            dbcVar = new dbc(String.valueOf(dbnVarB.getClass().getSimpleName()).concat("Decoder"), dbnVarB);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 930165504) {
                if (iHashCode != 1566015601) {
                    if (iHashCode == 1566016562 && str.equals("application/cea-708")) {
                        dbcVar = new dbx(bseVar.O, bseVar.t);
                    }
                } else if (str.equals("application/cea-608")) {
                    dbcVar = new dbt(str, bseVar.O);
                }
                dbkVar = ((cpw) this.n).a;
                if (!dbkVar.c(bseVar)) {
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(str)));
                }
                dbn dbnVarB2 = dbkVar.b(bseVar);
                dbcVar = new dbc(String.valueOf(dbnVarB2.getClass().getSimpleName()).concat("Decoder"), dbnVarB2);
            } else if (str.equals("application/x-mp4-cea-608")) {
                dbcVar = new dbt(str, bseVar.O);
            } else {
                dbkVar = ((cpw) this.n).a;
                if (!dbkVar.c(bseVar)) {
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(str)));
                }
                dbn dbnVarB3 = dbkVar.b(bseVar);
                dbcVar = new dbc(String.valueOf(dbnVarB3.getClass().getSimpleName()).concat("Decoder"), dbnVarB3);
            }
        }
        this.q = dbcVar;
        dbcVar.setOutputStartTimeUs(this.e);
    }

    private final void h(but butVar) {
        cbv cbvVar = new cbv(butVar.a, 16);
        dje djeVar = this.B.a.F;
        djeVar.h(27, cbvVar);
        djeVar.h(27, new cbv(butVar, 13));
    }

    @Override // defpackage.cav
    protected final void D() {
        this.z = null;
        this.k = -9223372036854775807L;
        d();
        this.A = -9223372036854775807L;
        if (this.q != null) {
            aj();
        }
    }

    @Override // defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        this.A = j;
        cps cpsVar = this.m;
        if (cpsVar != null) {
            cpsVar.d();
        }
        d();
        this.x = false;
        this.y = false;
        this.k = -9223372036854775807L;
        bse bseVar = this.z;
        if (bseVar == null || an(bseVar)) {
            return;
        }
        if (this.p != 0) {
            ak();
            return;
        }
        ai();
        dbe dbeVar = this.q;
        dbeVar.getClass();
        dbeVar.flush();
        dbeVar.setOutputStartTimeUs(this.e);
    }

    @Override // defpackage.cav
    protected final void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        bse bseVar = bseVarArr[0];
        this.z = bseVar;
        if (an(bseVar)) {
            this.m = this.z.P == 1 ? new cpu() : new cpv();
            return;
        }
        b();
        if (this.q != null) {
            this.p = 1;
        } else {
            g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:109:0x0201  */
    /* JADX WARN: Code duplicated, block: B:115:0x021b A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x021f A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x022c A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0242 A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x024a A[Catch: dbf -> 0x02b7, LOOP:4: B:124:0x0248->B:125:0x024a, LOOP_END, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0251 A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0257  */
    /* JADX WARN: Code duplicated, block: B:130:0x0258 A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x025e A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0271 A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0283 A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0289 A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x028d A[Catch: dbf -> 0x02b7, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02a2 A[Catch: dbf -> 0x02b7, TRY_LEAVE, TryCatch #1 {dbf -> 0x02b7, blocks: (B:113:0x0217, B:115:0x021b, B:117:0x021f, B:119:0x022c, B:120:0x022e, B:122:0x0232, B:123:0x0242, B:125:0x024a, B:127:0x0251, B:135:0x0267, B:137:0x0271, B:139:0x0277, B:141:0x027d, B:143:0x0283, B:148:0x02a2, B:144:0x0289, B:146:0x028d, B:130:0x0258, B:132:0x025e), top: B:158:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:158:0x0217 A[EXC_TOP_SPLITTER, LOOP:3: B:158:0x0217->B:174:0x0217, LOOP_START, PHI: r9 r10
      0x0217: PHI (r9v1 int) = (r9v0 int), (r9v8 int) binds: [B:112:0x0215, B:174:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r10v1 int) = (r10v0 int), (r10v3 int) binds: [B:112:0x0215, B:174:0x0217] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02bb A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[LOOP:1: B:39:0x00ce->B:41:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    @Override // defpackage.cdp
    public final void af(long j, long j2) {
        boolean z;
        long j3;
        int iB;
        long jC;
        boolean z2;
        dbi dbiVar;
        ccu ccuVar;
        int iK;
        int iK2;
        Object obj;
        boolean z3;
        long j4;
        long j5;
        ArrayList parcelableArrayList;
        daz dazVar;
        agjz agjzVar;
        int i;
        boolean zF;
        long j6;
        long jA;
        if (this.g) {
            long j7 = this.k;
            if (j7 != -9223372036854775807L && j >= j7) {
                ai();
                this.y = true;
            }
        }
        if (this.y) {
            return;
        }
        bse bseVar = this.z;
        bseVar.getClass();
        int i2 = -5;
        int i3 = -3;
        if (an(bseVar)) {
            this.m.getClass();
            if (this.x) {
                j5 = -9223372036854775807L;
            } else {
                ccu ccuVar2 = this.w;
                DecoderInputBuffer decoderInputBuffer = this.l;
                j5 = -9223372036854775807L;
                int iK3 = k(ccuVar2, decoderInputBuffer, 5);
                while (iK3 == -5) {
                    iK3 = k(ccuVar2, decoderInputBuffer, 5);
                }
                if (iK3 != -3) {
                    if (!decoderInputBuffer.isEndOfStream()) {
                        if (j >= decoderInputBuffer.timeUs - 1000000) {
                            if (k(ccuVar2, decoderInputBuffer, 0) != -4) {
                                if (decoderInputBuffer.isEndOfStream()) {
                                    this.x = true;
                                } else {
                                    decoderInputBuffer.flip();
                                    ByteBuffer byteBuffer = decoderInputBuffer.data;
                                    byteBuffer.getClass();
                                    long j8 = decoderInputBuffer.timeUs;
                                    byte[] bArrArray = byteBuffer.array();
                                    int iArrayOffset = byteBuffer.arrayOffset();
                                    int iLimit = byteBuffer.limit();
                                    Parcel parcelObtain = Parcel.obtain();
                                    parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                                    parcelObtain.setDataPosition(0);
                                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                                    parcelObtain.recycle();
                                    parcelableArrayList = bundle.getParcelableArrayList("c");
                                    parcelableArrayList.getClass();
                                    dazVar = new daz();
                                    agjzVar = new agjz(4);
                                    while (i < parcelableArrayList.size()) {
                                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                                        bundle2.getClass();
                                        agjzVar.h(dazVar.apply(bundle2));
                                    }
                                    abnx abnxVar = new abnx(agjzVar.g(), j8, bundle.getLong("d"));
                                    decoderInputBuffer.clear();
                                    zF = this.m.f(abnxVar, j);
                                }
                            }
                        }
                        jA = this.m.a(this.A);
                        if (jA == Long.MIN_VALUE) {
                            this.y = true;
                        }
                        if (jA == Long.MIN_VALUE) {
                            agke agkeVarC = this.m.c(j);
                            long jB = this.m.b(j);
                            ahno.O(jB != j5);
                            al(new but(agkeVarC));
                            this.m.e(jB);
                        } else {
                            agke agkeVarC2 = this.m.c(j);
                            long jB2 = this.m.b(j);
                            ahno.O(jB2 != j5);
                            al(new but(agkeVarC2));
                            this.m.e(jB2);
                        }
                        this.A = j;
                        return;
                    }
                    j6 = this.j;
                    long j9 = j - this.d;
                    if (j6 == -9223372036854775807L) {
                    }
                } else if (decoderInputBuffer.isEndOfStream()) {
                    j6 = this.j;
                    long j10 = j - this.d;
                    if (j6 == -9223372036854775807L && j10 >= j6 - 1000000) {
                        if (k(ccuVar2, decoderInputBuffer, 0) != -4) {
                            if (decoderInputBuffer.isEndOfStream()) {
                                this.x = true;
                            } else {
                                decoderInputBuffer.flip();
                                ByteBuffer byteBuffer2 = decoderInputBuffer.data;
                                byteBuffer2.getClass();
                                long j11 = decoderInputBuffer.timeUs;
                                byte[] bArrArray2 = byteBuffer2.array();
                                int iArrayOffset2 = byteBuffer2.arrayOffset();
                                int iLimit2 = byteBuffer2.limit();
                                Parcel parcelObtain2 = Parcel.obtain();
                                parcelObtain2.unmarshall(bArrArray2, iArrayOffset2, iLimit2);
                                parcelObtain2.setDataPosition(0);
                                Bundle bundle3 = parcelObtain2.readBundle(Bundle.class.getClassLoader());
                                parcelObtain2.recycle();
                                parcelableArrayList = bundle3.getParcelableArrayList("c");
                                parcelableArrayList.getClass();
                                dazVar = new daz();
                                agjzVar = new agjz(4);
                                for (i = 0; i < parcelableArrayList.size(); i++) {
                                    Bundle bundle4 = (Bundle) parcelableArrayList.get(i);
                                    bundle4.getClass();
                                    agjzVar.h(dazVar.apply(bundle4));
                                }
                                abnx abnxVar2 = new abnx(agjzVar.g(), j11, bundle3.getLong("d"));
                                decoderInputBuffer.clear();
                                zF = this.m.f(abnxVar2, j);
                            }
                        }
                    }
                    jA = this.m.a(this.A);
                    if (jA == Long.MIN_VALUE && this.x && !zF) {
                        this.y = true;
                    }
                    if ((jA == Long.MIN_VALUE && jA <= j) || zF) {
                        agke agkeVarC3 = this.m.c(j);
                        long jB3 = this.m.b(j);
                        ahno.O(jB3 != j5);
                        al(new but(agkeVarC3));
                        this.m.e(jB3);
                    }
                    this.A = j;
                    return;
                }
            }
            zF = false;
            jA = this.m.a(this.A);
            if (jA == Long.MIN_VALUE) {
                this.y = true;
            }
            if (jA == Long.MIN_VALUE) {
                agke agkeVarC4 = this.m.c(j);
                long jB4 = this.m.b(j);
                ahno.O(jB4 != j5);
                al(new but(agkeVarC4));
                this.m.e(jB4);
            } else {
                agke agkeVarC5 = this.m.c(j);
                long jB5 = this.m.b(j);
                ahno.O(jB5 != j5);
                al(new but(agkeVarC5));
                this.m.e(jB5);
            }
            this.A = j;
            return;
        }
        b();
        this.A = j;
        if (this.t == null) {
            dbe dbeVar = this.q;
            dbeVar.getClass();
            dbeVar.l(j);
            try {
                dbe dbeVar2 = this.q;
                dbeVar2.getClass();
                this.t = (dbj) dbeVar2.dequeueOutputBuffer();
            } catch (dbf e) {
                e(e);
                return;
            }
        }
        if (this.b == 2) {
            if (this.s != null) {
                long jA2 = a();
                z = false;
                while (jA2 <= j) {
                    this.u++;
                    jA2 = a();
                    z = true;
                }
            } else {
                z = false;
            }
            dbj dbjVar = this.t;
            if (dbjVar != null) {
                if (dbjVar.isEndOfStream()) {
                    if (z) {
                        j3 = -1000000;
                    } else {
                        if (a() == Long.MAX_VALUE) {
                            if (this.p == 2) {
                                ak();
                            } else {
                                ai();
                                this.y = true;
                            }
                        }
                        j3 = -1000000;
                    }
                    if (this.p != 2) {
                        while (!this.x) {
                            try {
                                dbiVar = this.r;
                                if (dbiVar == null) {
                                    dbe dbeVar3 = this.q;
                                    dbeVar3.getClass();
                                    dbiVar = (dbi) dbeVar3.dequeueInputBuffer();
                                    if (dbiVar == null) {
                                        return;
                                    } else {
                                        this.r = dbiVar;
                                    }
                                }
                                if (this.p == 1) {
                                    dbiVar.setFlags(4);
                                    dbe dbeVar4 = this.q;
                                    dbeVar4.getClass();
                                    dbeVar4.queueInputBuffer(dbiVar);
                                    this.r = null;
                                    this.p = 2;
                                    return;
                                }
                                ccuVar = this.w;
                                iK = k(ccuVar, dbiVar, 5);
                                while (iK == i2) {
                                    iK = k(ccuVar, dbiVar, 5);
                                }
                                if (iK != i3) {
                                    if (!dbiVar.isEndOfStream()) {
                                        if (j < dbiVar.timeUs + j3) {
                                            return;
                                        }
                                    }
                                    iK2 = k(ccuVar, dbiVar, 0);
                                    if (iK2 == -4) {
                                        if (dbiVar.isEndOfStream()) {
                                            this.x = true;
                                            this.o = false;
                                            z3 = false;
                                        } else {
                                            obj = ccuVar.b;
                                            if (obj != null) {
                                                return;
                                            }
                                            dbiVar.a = ((bse) obj).v;
                                            dbiVar.flip();
                                            z3 = this.o & (!dbiVar.isKeyFrame());
                                            this.o = z3;
                                        }
                                        if (!z3) {
                                            dbe dbeVar5 = this.q;
                                            dbeVar5.getClass();
                                            dbeVar5.queueInputBuffer(dbiVar);
                                            this.r = null;
                                        }
                                        i2 = -5;
                                        i3 = -3;
                                    } else {
                                        if (iK2 != -3) {
                                            return;
                                        }
                                        i3 = -3;
                                        i2 = -5;
                                    }
                                } else if (!dbiVar.isEndOfStream()) {
                                    return;
                                }
                                j4 = this.j;
                                long j12 = j - this.d;
                                if (j4 != -9223372036854775807L || j12 < j4 + j3) {
                                    return;
                                }
                                iK2 = k(ccuVar, dbiVar, 0);
                                if (iK2 == -4) {
                                    if (dbiVar.isEndOfStream()) {
                                        this.x = true;
                                        this.o = false;
                                        z3 = false;
                                    } else {
                                        obj = ccuVar.b;
                                        if (obj != null) {
                                            return;
                                        }
                                        dbiVar.a = ((bse) obj).v;
                                        dbiVar.flip();
                                        z3 = this.o & (!dbiVar.isKeyFrame());
                                        this.o = z3;
                                    }
                                    if (!z3) {
                                        dbe dbeVar6 = this.q;
                                        dbeVar6.getClass();
                                        dbeVar6.queueInputBuffer(dbiVar);
                                        this.r = null;
                                    }
                                    i2 = -5;
                                    i3 = -3;
                                } else {
                                    if (iK2 != -3) {
                                        return;
                                    }
                                    i3 = -3;
                                    i2 = -5;
                                }
                            } catch (dbf e2) {
                                e(e2);
                                return;
                            }
                        }
                    }
                }
                j3 = -1000000;
                if (dbjVar.timeUs <= j) {
                    dbj dbjVar2 = this.s;
                    if (dbjVar2 != null) {
                        dbjVar2.release();
                    }
                    this.u = dbjVar.b(j);
                    this.s = dbjVar;
                    this.t = null;
                }
                dbj dbjVar3 = this.s;
                dbjVar3.getClass();
                iB = dbjVar3.b(j);
                if (iB != 0 || this.s.a() == 0) {
                    jC = this.s.timeUs;
                } else {
                    dbj dbjVar4 = this.s;
                    jC = iB == -1 ? dbjVar4.c(dbjVar4.a() - 1) : dbjVar4.c(iB - 1);
                }
                if (jC != -9223372036854775807L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ahno.O(z2);
                al(new but(this.s.e(j)));
                if (this.p != 2) {
                    while (!this.x) {
                        dbiVar = this.r;
                        if (dbiVar == null) {
                            dbe dbeVar7 = this.q;
                            dbeVar7.getClass();
                            dbiVar = (dbi) dbeVar7.dequeueInputBuffer();
                            if (dbiVar == null) {
                                return;
                            } else {
                                this.r = dbiVar;
                            }
                        }
                        if (this.p == 1) {
                            dbiVar.setFlags(4);
                            dbe dbeVar8 = this.q;
                            dbeVar8.getClass();
                            dbeVar8.queueInputBuffer(dbiVar);
                            this.r = null;
                            this.p = 2;
                            return;
                        }
                        ccuVar = this.w;
                        iK = k(ccuVar, dbiVar, 5);
                        while (iK == i2) {
                            iK = k(ccuVar, dbiVar, 5);
                        }
                        if (iK != i3) {
                            if (!dbiVar.isEndOfStream()) {
                                if (j < dbiVar.timeUs + j3) {
                                    return;
                                }
                            }
                            iK2 = k(ccuVar, dbiVar, 0);
                            if (iK2 == -4) {
                                if (dbiVar.isEndOfStream()) {
                                    this.x = true;
                                    this.o = false;
                                    z3 = false;
                                } else {
                                    obj = ccuVar.b;
                                    if (obj != null) {
                                        return;
                                    }
                                    dbiVar.a = ((bse) obj).v;
                                    dbiVar.flip();
                                    z3 = this.o & (!dbiVar.isKeyFrame());
                                    this.o = z3;
                                }
                                if (!z3) {
                                    dbe dbeVar9 = this.q;
                                    dbeVar9.getClass();
                                    dbeVar9.queueInputBuffer(dbiVar);
                                    this.r = null;
                                }
                                i2 = -5;
                                i3 = -3;
                            } else {
                                if (iK2 != -3) {
                                    return;
                                }
                                i3 = -3;
                                i2 = -5;
                            }
                        } else if (!dbiVar.isEndOfStream()) {
                            return;
                        }
                        j4 = this.j;
                        long j13 = j - this.d;
                        if (j4 != -9223372036854775807L) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
            j3 = -1000000;
            if (z) {
                dbj dbjVar5 = this.s;
                dbjVar5.getClass();
                iB = dbjVar5.b(j);
                if (iB != 0) {
                    jC = this.s.timeUs;
                } else {
                    jC = this.s.timeUs;
                }
                if (jC != -9223372036854775807L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ahno.O(z2);
                al(new but(this.s.e(j)));
            }
            if (this.p != 2) {
                while (!this.x) {
                    dbiVar = this.r;
                    if (dbiVar == null) {
                        dbe dbeVar10 = this.q;
                        dbeVar10.getClass();
                        dbiVar = (dbi) dbeVar10.dequeueInputBuffer();
                        if (dbiVar == null) {
                            return;
                        } else {
                            this.r = dbiVar;
                        }
                    }
                    if (this.p == 1) {
                        dbiVar.setFlags(4);
                        dbe dbeVar11 = this.q;
                        dbeVar11.getClass();
                        dbeVar11.queueInputBuffer(dbiVar);
                        this.r = null;
                        this.p = 2;
                        return;
                    }
                    ccuVar = this.w;
                    iK = k(ccuVar, dbiVar, 5);
                    while (iK == i2) {
                        iK = k(ccuVar, dbiVar, 5);
                    }
                    if (iK != i3) {
                        if (!dbiVar.isEndOfStream()) {
                            if (j < dbiVar.timeUs + j3) {
                                return;
                            }
                        }
                        iK2 = k(ccuVar, dbiVar, 0);
                        if (iK2 == -4) {
                            if (dbiVar.isEndOfStream()) {
                                this.x = true;
                                this.o = false;
                                z3 = false;
                            } else {
                                obj = ccuVar.b;
                                if (obj != null) {
                                    return;
                                }
                                dbiVar.a = ((bse) obj).v;
                                dbiVar.flip();
                                z3 = this.o & (!dbiVar.isKeyFrame());
                                this.o = z3;
                            }
                            if (!z3) {
                                dbe dbeVar12 = this.q;
                                dbeVar12.getClass();
                                dbeVar12.queueInputBuffer(dbiVar);
                                this.r = null;
                            }
                            i2 = -5;
                            i3 = -3;
                        } else {
                            if (iK2 != -3) {
                                return;
                            }
                            i3 = -3;
                            i2 = -5;
                        }
                    } else if (!dbiVar.isEndOfStream()) {
                        return;
                    }
                    j4 = this.j;
                    long j14 = j - this.d;
                    if (j4 != -9223372036854775807L) {
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.cdp
    public final boolean ag() {
        return this.y;
    }

    @Override // defpackage.cdp
    public final boolean ah() {
        bse bseVar = this.z;
        if (bseVar == null) {
            return true;
        }
        if (an(bseVar)) {
            cps cpsVar = this.m;
            cpsVar.getClass();
            if (cpsVar.a(this.A) != Long.MIN_VALUE) {
                return true;
            }
            try {
                C();
                return true;
            } catch (IOException unused) {
            }
        } else if (!this.y && (!this.x || am(this.s, this.A) || am(this.t, this.A) || this.r == null)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        if (!an(bseVar)) {
            cpx cpxVar = this.n;
            String str = bseVar.q;
            if (!((cpw) cpxVar).a.c(bseVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (bsy.m(str)) {
                    return 129;
                }
                return SemanticState.Focused;
            }
        }
        return 128 | (bseVar.S == 0 ? 4 : 2);
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        h((but) message.obj);
        return true;
    }
}
