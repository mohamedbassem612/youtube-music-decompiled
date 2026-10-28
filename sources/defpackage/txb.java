package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txb {
    public static final txb A;
    public static final txb B;
    public static final txb C;
    public static final txb D;
    public static final txb E;
    public static final txb F;
    public static final txb G;
    public static final txb H;
    public static final txb I;
    public static final txb J;
    public static final txb K;
    public static final txb L;
    public static final txb M;
    public static final txb N;
    private static final /* synthetic */ txb[] O;
    public static final txb a;
    public static final txb b;
    public static final txb c;
    public static final txb d;
    public static final txb e;
    public static final txb f;
    public static final txb g;
    public static final txb h;
    public static final txb i;
    public static final txb j;
    public static final txb k;
    public static final txb l;
    public static final txb m;
    public static final txb n;
    public static final txb o;
    public static final txb p;
    public static final txb q;
    public static final txb r;
    public static final txb s;
    public static final txb t;
    public static final txb u;
    public static final txb v;
    public static final txb w;
    public static final txb x;
    public static final txb y;
    public static final txb z;

    static {
        txb txbVar = new txb("SUCCESS", 0);
        a = txbVar;
        txb txbVar2 = new txb("FAILED_MMAP", 1);
        b = txbVar2;
        txb txbVar3 = new txb("FAILED_UNMAP", 2);
        c = txbVar3;
        txb txbVar4 = new txb("FAILED_MMAP_COULD_NOT_GROW", 3);
        d = txbVar4;
        txb txbVar5 = new txb("FAILED_MMAP_OPEN", 4);
        e = txbVar5;
        txb txbVar6 = new txb("FAILED_MMAP_FSTAT", 5);
        f = txbVar6;
        txb txbVar7 = new txb("FAILED_MMAP_FTRUNCATE", 6);
        g = txbVar7;
        txb txbVar8 = new txb("FAILED_MMAP_WRITE", 7);
        h = txbVar8;
        txb txbVar9 = new txb("FAILED_MMAP_MMAP", 8);
        i = txbVar9;
        txb txbVar10 = new txb("FAILED_MMAP_MPROTECT", 9);
        j = txbVar10;
        txb txbVar11 = new txb("FAILED_CHANGE_SIZE", 10);
        k = txbVar11;
        txb txbVar12 = new txb("FAILED_UNSAFE", 11);
        l = txbVar12;
        txb txbVar13 = new txb("FAILED_COMPRESS", 12);
        m = txbVar13;
        txb txbVar14 = new txb("FAILED_DECOMPRESS", 13);
        n = txbVar14;
        txb txbVar15 = new txb("FAILED_LOAD", 14);
        o = txbVar15;
        txb txbVar16 = new txb("LOST_OVERFLOW", 15);
        p = txbVar16;
        txb txbVar17 = new txb("COULD_NOT_SERIALIZE_OVERFLOW", 16);
        q = txbVar17;
        txb txbVar18 = new txb("COULD_NOT_DESERIALIZE_OVERFLOW", 17);
        r = txbVar18;
        txb txbVar19 = new txb("COULD_NOT_DELETE_OVERFLOW", 18);
        s = txbVar19;
        txb txbVar20 = new txb("COULD_NOT_DELETE_BACKING_FILE", 19);
        t = txbVar20;
        txb txbVar21 = new txb("ADD_EXCEEDED_EPOCH", 20);
        u = txbVar21;
        txb txbVar22 = new txb("ADD_NO_SPACE", 21);
        v = txbVar22;
        txb txbVar23 = new txb("MMAP_ATTEMPTED_GROW_FILE", 22);
        w = txbVar23;
        txb txbVar24 = new txb("MMAP_ATTEMPTED_SHRINK_FILE", 23);
        x = txbVar24;
        txb txbVar25 = new txb("MMAP_USED_RAM_BACKUP", 24);
        y = txbVar25;
        txb txbVar26 = new txb("ITEM_USED_OVERFLOW", 25);
        z = txbVar26;
        txb txbVar27 = new txb("CONDENSED", 26);
        A = txbVar27;
        txb txbVar28 = new txb("CONDENSE_FAILED", 27);
        B = txbVar28;
        txb txbVar29 = new txb("FAILED_REPOCH", 28);
        C = txbVar29;
        txb txbVar30 = new txb("CORRUPT_LIST_INFINITE_LOOP", 29);
        D = txbVar30;
        txb txbVar31 = new txb("CORRUPT_LIST_OUT_OF_RANGE", 30);
        E = txbVar31;
        txb txbVar32 = new txb("CORRUPT_ITEM_CHECKSUM", 31);
        F = txbVar32;
        txb txbVar33 = new txb("CORRUPT_ITEM_OUT_OF_RANGE", 32);
        G = txbVar33;
        txb txbVar34 = new txb("CORRUPT_ITEM_GEN_OUT_OF_RANGE", 33);
        H = txbVar34;
        txb txbVar35 = new txb("CORRUPT_ITEM_SIZE_TOO_SMALL", 34);
        I = txbVar35;
        txb txbVar36 = new txb("CORRUPT_OVERFLOW_CHECKSUM", 35);
        J = txbVar36;
        txb txbVar37 = new txb("CORRUPT_HEADER", 36);
        K = txbVar37;
        txb txbVar38 = new txb("CORRUPT_HEADER_CHECKSUM", 37);
        L = txbVar38;
        txb txbVar39 = new txb("CORRUPT_USER_CHECKSUM", 38);
        M = txbVar39;
        txb txbVar40 = new txb("CORRUPT_NO_ROOTS", 39);
        N = txbVar40;
        O = new txb[]{txbVar, txbVar2, txbVar3, txbVar4, txbVar5, txbVar6, txbVar7, txbVar8, txbVar9, txbVar10, txbVar11, txbVar12, txbVar13, txbVar14, txbVar15, txbVar16, txbVar17, txbVar18, txbVar19, txbVar20, txbVar21, txbVar22, txbVar23, txbVar24, txbVar25, txbVar26, txbVar27, txbVar28, txbVar29, txbVar30, txbVar31, txbVar32, txbVar33, txbVar34, txbVar35, txbVar36, txbVar37, txbVar38, txbVar39, txbVar40};
    }

    public static txb[] values() {
        return (txb[]) O.clone();
    }
}
