package defpackage;

import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMessageValueUtils;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.jni.UnsafeMemory;
import internal.org.jni_zero.CommonApis;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mew implements mes, mwq, mwr, mxj, mxk, mxl, mxu, mxz, myb, mye, myk, myw, mzg, nae, nbm, nbo, nch, nck, ncy, nda, ncz, ndq, nds, nea, nei, nen, nff {
    public static final boolean a = mfd.b;
    public UpbMessage b;
    public long c;

    public mew(UpbMessage upbMessage) {
        if (upbMessage == null) {
            throw new NullPointerException("Invalid UpbMessage");
        }
        this.b = upbMessage;
        this.c = upbMessage.a;
    }

    @Override // defpackage.mxl
    public final int U() {
        int iAS = a.aS(Memory.peekInt(this.c + 16, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.mxu
    public final int V() {
        int iAU = a.aU(Memory.peekInt(this.c + 12, false));
        if (iAU == 0) {
            return 1;
        }
        return iAU;
    }

    public float W() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    public int X() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.nbm
    public final float Y() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 20, false));
    }

    @Override // defpackage.nbm
    public final int Z() {
        return Memory.peekInt(this.c + 16, false);
    }

    public boolean aA() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    public boolean aB() {
        return Memory.peekByte(this.c + 10) != 0;
    }

    public boolean aC() {
        return Memory.peekByte(this.c + 13) != 0;
    }

    public boolean aD() {
        return (Memory.peekByte(this.c + 8) & 128) != 0;
    }

    public boolean aE() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    public boolean aF() {
        return (Memory.peekByte(this.c + 8) & 8) != 0;
    }

    public boolean aG() {
        return (Memory.peekByte(this.c + 8) & 64) != 0;
    }

    public boolean aH() {
        return (Memory.peekByte(this.c + 8) & 32) != 0;
    }

    public boolean aI() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    public boolean aJ() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    public boolean aK() {
        return (Memory.peekByte(this.c + 8) & 16) != 0;
    }

    public final int aL() {
        int iAS = a.aS(Memory.peekInt(this.c + 44, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    public final int aM() {
        int iAU = a.aU(Memory.peekInt(this.c + 12, false));
        if (iAU == 0) {
            return 1;
        }
        return iAU;
    }

    protected final void aN(ArrayList arrayList) {
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            mew mewVar = (mew) arrayList.get(i);
            mewVar.bJ();
            this.b.c.d(mewVar.b.c);
            jArr[i] = mewVar.c;
        }
        UpbMessage upbMessage = this.b;
        upbMessage.jniSetMap(upbMessage.a, upbMessage.b.a, upbMessage.c.a, 1, jArr);
    }

    @Override // defpackage.mxk
    public int aO() {
        int iBi = a.bi(Memory.peekInt(this.c + 32, false));
        if (iBi == 0) {
            return 1;
        }
        return iBi;
    }

    @Override // defpackage.mxk
    public final int aP() {
        int iBi = a.bi(Memory.peekInt(this.c + 40, false));
        if (iBi == 0) {
            return 1;
        }
        return iBi;
    }

    @Override // defpackage.myk
    public final int aQ() {
        int iF = CommonApis.f(Memory.peekInt(this.c + 16, false));
        if (iF == 0) {
            return 1;
        }
        return iF;
    }

    @Override // defpackage.nbm
    public final int aa() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.nbm
    public final boolean ab() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.nbm
    public final boolean ac() {
        return Memory.peekByte(this.c + 11) != 0;
    }

    @Override // defpackage.nbm
    public final boolean ad() {
        return Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.nbm
    public final boolean ae() {
        return (Memory.peekByte(this.c + 8) & 8) != 0;
    }

    @Override // defpackage.nbm
    public final boolean af() {
        return (Memory.peekByte(this.c + 8) & 16) != 0;
    }

    @Override // defpackage.nbm
    public final boolean ag() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.nbo
    public final float ah() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 20, false));
    }

    @Override // defpackage.nbo
    public final float ai() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nbo
    public final float aj() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    @Override // defpackage.nbo
    public boolean ak() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.nbo
    public final boolean al() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    @Override // defpackage.nbo
    public final boolean am() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    @Override // defpackage.ncy
    public final float an() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.ncy
    public final int ao() {
        int iAS = a.aS(Memory.peekInt(this.c + 16, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    public float ap() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    public float aq() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    @Override // defpackage.ndq
    public final boolean ar() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    @Override // defpackage.ndq
    public final boolean as() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    public long at() {
        return Memory.peekLong(this.c + 16, false);
    }

    @Override // defpackage.nea
    public final int au() {
        int iAS = a.aS(Memory.peekInt(this.c + 12, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    public boolean av() {
        return Memory.peekByte(this.c + 16) != 0;
    }

    public boolean aw() {
        return Memory.peekByte(this.c + 11) != 0;
    }

    public boolean ax() {
        return Memory.peekByte(this.c + 12) != 0;
    }

    public boolean ay() {
        return Memory.peekByte(this.c + 15) != 0;
    }

    public boolean az() {
        return Memory.peekByte(this.c + 14) != 0;
    }

    protected final ArrayList bB(int i, UpbMiniTable upbMiniTable, mex mexVar) {
        long j = this.c + ((long) i);
        UpbArena upbArena = this.b.c;
        boolean z = UpbMessageValueUtils.a;
        long[] jArrJniRetrieveMap = UpbMessageValueUtils.jniRetrieveMap(UnsafeMemory.c ? Memory.peekLong(j, false) : Memory.peekInt(j, false), upbMiniTable.a, upbArena.a);
        if (jArrJniRetrieveMap == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jArrJniRetrieveMap.length);
        for (long j2 : jArrJniRetrieveMap) {
            arrayList.add(mexVar.a(new UpbMessage(j2, upbMiniTable, this.b.c)));
        }
        return arrayList;
    }

    protected final ArrayList bC(int i) {
        long j = this.c + ((long) i);
        boolean z = UpbMessageValueUtils.a;
        float[] fArrJniRetrieveFloatArray = UpbMessageValueUtils.jniRetrieveFloatArray(UnsafeMemory.c ? Memory.peekLong(j, false) : Memory.peekInt(j, false));
        if (fArrJniRetrieveFloatArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(fArrJniRetrieveFloatArray.length);
        for (float f : fArrJniRetrieveFloatArray) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    protected final ArrayList bD(int i) {
        long j = this.c + ((long) i);
        boolean z = UpbMessageValueUtils.a;
        int[] iArrJniRetrieveIntArray = UpbMessageValueUtils.jniRetrieveIntArray(UnsafeMemory.c ? Memory.peekLong(j, false) : Memory.peekInt(j, false));
        if (iArrJniRetrieveIntArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(iArrJniRetrieveIntArray.length);
        for (int i2 : iArrJniRetrieveIntArray) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    protected final ArrayList bE(int i, UpbMiniTable upbMiniTable, mex mexVar) {
        long j = this.c + ((long) i);
        boolean z = UpbMessageValueUtils.a;
        long[] jArrJniRetrievePointerArray = UpbMessageValueUtils.jniRetrievePointerArray(UnsafeMemory.c ? Memory.peekLong(j, false) : Memory.peekInt(j, false));
        if (jArrJniRetrievePointerArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jArrJniRetrievePointerArray.length);
        for (long j2 : jArrJniRetrievePointerArray) {
            arrayList.add(mexVar.a(new UpbMessage(j2, upbMiniTable, this.b.c)));
        }
        return arrayList;
    }

    protected final ArrayList bF(int i) {
        long jPeekInt;
        boolean z;
        long j = this.c + ((long) i);
        boolean z2 = UpbMessageValueUtils.a;
        boolean z3 = UnsafeMemory.c;
        long jPeekLong = z3 ? Memory.peekLong(j, false) : Memory.peekInt(j, false);
        if (jPeekLong == 0) {
            return new ArrayList();
        }
        if (z3) {
            jPeekInt = Memory.peekLong(jPeekLong, false);
            z = true;
        } else {
            jPeekInt = Memory.peekInt(jPeekLong, false);
            z = false;
        }
        long jPeekLong2 = (z ? Memory.peekLong(jPeekLong, false) : Memory.peekInt(jPeekLong, false)) & 3;
        long j2 = 1 << ((int) (jPeekLong2 != 0 ? jPeekLong2 + 1 : 0L));
        long j3 = jPeekLong + ((long) mfd.a);
        long jPeekLong3 = z ? Memory.peekLong(j3, false) : Memory.peekInt(j3, false);
        long j4 = jPeekInt & (-8);
        long j5 = jPeekLong3 * j2;
        ArrayList arrayList = new ArrayList((int) jPeekLong3);
        for (long j6 = j4; j6 < j4 + j5; j6 += j2) {
            String strJniConvertToShortString = UpbMessageValueUtils.jniConvertToShortString(j6);
            if (strJniConvertToShortString == null) {
                strJniConvertToShortString = UpbMessageValueUtils.jniConvertToLongString(j6);
            }
            arrayList.add(strJniConvertToShortString);
        }
        return arrayList;
    }

    public final void bG() {
        UpbMessage upbMessageA = this.b.clone();
        this.b = upbMessageA;
        this.c = upbMessageA.a;
        if (upbMessageA == null) {
            throw new NullPointerException("Invalid UpbMessage");
        }
    }

    public final void bH(byte[] bArr) {
        UpbMessage upbMessage = this.b;
        upbMessage.jniDecode(upbMessage.a, upbMessage.b.a, upbMessage.c.a, bArr, 0, bArr.length);
    }

    protected final void bI(int i) {
        long j = this.b.a + ((long) i);
        if (UnsafeMemory.c) {
            Memory.pokeLong(j, 0L, false);
        } else {
            Memory.pokeInt(j, 0, false);
        }
    }

    public final void bK(int i, boolean z) {
        Memory.pokeByte(this.c + ((long) i), z ? (byte) 1 : (byte) 0);
    }

    public final void bL(int i, byte[] bArr) {
        long j = this.c + ((long) i);
        long j2 = this.b.c.a;
        boolean z = UpbMessageValueUtils.a;
        UpbMessageValueUtils.jniCopyAndWriteByteArray(j, bArr, bArr.length, j2);
    }

    public final void bM(mep mepVar, mew mewVar) {
        mewVar.bJ();
        this.b.c.d(mewVar.b.c);
        UpbMessage upbMessage = this.b;
        long jA = mepVar.a();
        mepVar.d();
        upbMessage.jniSetExtension(upbMessage.a, jA, mewVar.b.a, upbMessage.c.a);
    }

    public final void bN(mfc mfcVar) {
        mfcVar.a(this.b.a);
    }

    public final void bO(int i, int i2) {
        long j = this.b.a + ((long) i);
        Memory.pokeByte(j, (byte) (Memory.peekByte(j) | i2));
    }

    public final void bP(int i, float f) {
        Memory.pokeInt(this.c + ((long) i), Float.floatToRawIntBits(f), false);
    }

    public final void bQ(int i, int i2) {
        Memory.pokeInt(this.c + ((long) i), i2, false);
    }

    protected final void bR(int i, mew mewVar) {
        mewVar.bJ();
        this.b.c.d(mewVar.b.c);
        long j = this.c + ((long) i);
        long j2 = mewVar.c;
        if (UnsafeMemory.c) {
            Memory.pokeLong(j, j2, false);
        } else {
            Memory.pokeInt(j, (int) j2, false);
        }
    }

    protected final void bS(int i, ArrayList arrayList) {
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            mew mewVar = (mew) arrayList.get(i2);
            mewVar.bJ();
            this.b.c.d(mewVar.b.c);
            jArr[i2] = mewVar.c;
        }
        UpbMessage upbMessage = this.b;
        upbMessage.jniSetRepeatedPointer(upbMessage.a, upbMessage.b.a, upbMessage.c.a, i, jArr);
    }

    public final void bT(int i, CharSequence charSequence) {
        bL(i, charSequence.toString().getBytes(StandardCharsets.UTF_8));
    }

    public int bU() {
        return Memory.peekInt(this.c + 16, false);
    }

    public int bV() {
        return Memory.peekInt(this.c + 12, false);
    }

    public float bW() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    public float bX() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    public int bY() {
        return Memory.peekInt(this.c + 16, false);
    }

    public int bZ() {
        return Memory.peekInt(this.c + 12, false);
    }

    public float ca() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    public float cb() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 24, false));
    }

    public float cc() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 20, false));
    }

    public float cd() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    public float ce() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(28 + j);
        byte bPeekByte2 = Memory.peekByte(29 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) == 1) {
            return Float.intBitsToFloat(Memory.peekInt(j + 32, false));
        }
        return 0.0f;
    }

    public float cf() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(36 + j);
        byte bPeekByte2 = Memory.peekByte(37 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
            return Float.intBitsToFloat(Memory.peekInt(j + 40, false));
        }
        return 0.0f;
    }

    public boolean cg() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    public boolean ch() {
        return (Memory.peekByte(this.c + 8) & 8) != 0;
    }

    public boolean ci() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    public boolean cj() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    public boolean ck() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(28 + j);
        byte bPeekByte2 = Memory.peekByte(j + 29);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 1;
    }

    public boolean cl() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(28 + j);
        byte bPeekByte2 = Memory.peekByte(j + 29);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 2;
    }

    public boolean cm() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(36 + j);
        byte bPeekByte2 = Memory.peekByte(j + 37);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    public boolean cn() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(36 + j);
        byte bPeekByte2 = Memory.peekByte(j + 37);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 4;
    }

    public float co() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    public final UpbMessage cp(int i, UpbMiniTable upbMiniTable) {
        long j = this.c + ((long) i);
        return new UpbMessage(UnsafeMemory.c ? Memory.peekLong(j, false) : Memory.peekInt(j, false), upbMiniTable, this.b.c);
    }

    public final String cq(int i) {
        long j = this.c + ((long) i);
        String strJniConvertToShortString = UpbMessageValueUtils.jniConvertToShortString(j);
        return strJniConvertToShortString == null ? UpbMessageValueUtils.jniConvertToLongString(j) : strJniConvertToShortString;
    }

    public final ByteBuffer cr(int i) {
        long j = this.c + ((long) i);
        return UpbMessageValueUtils.a(UpbMessageValueUtils.jniByteBufferFromStringView(j), this.b.c);
    }

    @Override // defpackage.mes
    public final met d(mep mepVar) {
        return mepVar.c(this.b.c(mepVar.a(), mepVar.d()));
    }

    @Override // defpackage.mes
    public final boolean e(mep mepVar) {
        try {
            return UpbMessage.jniHasExtension(this.b.a, mepVar.a);
        } catch (NullPointerException e) {
            throw new IllegalStateException("jniHasExtension returned null: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mew) {
            return this.b.equals(((mew) obj).b);
        }
        return false;
    }

    @Override // defpackage.met
    public final byte[] f() {
        bJ();
        UpbMessage upbMessage = this.b;
        return upbMessage.jniEncode(upbMessage.a, upbMessage.b.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String string;
        boolean z = UpbMessageValueUtils.a;
        String simpleName = getClass().getSimpleName();
        String strJniToDebugString = UpbMessageValueUtils.jniToDebugString(this.c, this.b.b.a);
        if (strJniToDebugString == null) {
            string = null;
        } else {
            Iterable<String> iterableF = agfm.b('\n').f(strJniToDebugString);
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" {\n");
            for (String str : iterableF) {
                sb.append("  ");
                sb.append(str);
                sb.append('\n');
            }
            sb.append('}');
            string = sb.toString();
        }
        return string == null ? super.toString() : string;
    }

    public mew(UpbMiniTable upbMiniTable) {
        this(UpbMessage.b(upbMiniTable, new UpbArena()));
    }

    public mew() {
        this(nmm.a);
    }

    public void bJ() {
    }

    public mew(UpbMessage upbMessage, short[] sArr) {
        this(upbMessage);
    }

    public mew(float[] fArr) {
        this((char[]) null);
    }

    public mew(UpbMessage upbMessage, char[] cArr) {
        this(upbMessage);
    }

    public mew(char[] cArr) {
        this(ainh.a);
    }

    public mew(short[][] sArr) {
        this(asrg.a);
    }

    public mew(UpbMessage upbMessage, int[] iArr) {
        this(upbMessage);
    }

    public mew(char[][] cArr) {
        this(asvl.a);
    }

    public mew(UpbMessage upbMessage, byte[] bArr) {
        this(upbMessage);
    }

    public mew(int[][] iArr) {
        this((byte[]) null);
    }

    public mew(UpbMessage upbMessage, boolean[] zArr) {
        this(upbMessage);
    }

    public mew(byte[] bArr) {
        this(aszg.a);
    }

    public mew(byte[][] bArr) {
        this((int[]) null);
    }

    public mew(UpbMessage upbMessage, float[] fArr) {
        this(upbMessage);
    }

    public mew(int[] iArr) {
        this(atkx.a);
    }

    public mew(UpbMessage upbMessage, char[][] cArr) {
        this(upbMessage);
    }

    public mew(short[] sArr) {
        this(atmk.a);
    }

    public mew(boolean[][] zArr) {
        this((boolean[]) null);
    }

    public mew(UpbMessage upbMessage, byte[][] bArr) {
        this(upbMessage);
    }

    public mew(boolean[] zArr) {
        this(atoe.a);
    }
}
