package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afft {
    public int a;

    public afft(byte[] bArr) {
        this.a = 1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0035 A[Catch: all -> 0x0051, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:24:0x0035, B:32:0x0048, B:15:0x001f, B:16:0x0022, B:33:0x004a, B:17:0x0023, B:23:0x0031, B:25:0x0038, B:26:0x0039, B:31:0x0045, B:36:0x004e), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0048 A[Catch: all -> 0x0051, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:24:0x0035, B:32:0x0048, B:15:0x001f, B:16:0x0022, B:33:0x004a, B:17:0x0023, B:23:0x0031, B:25:0x0038, B:26:0x0039, B:31:0x0045, B:36:0x004e), top: B:41:0x0001 }] */
    public final synchronized int a(aacb aacbVar) {
        int iOrdinal = aacbVar.ordinal();
        if (iOrdinal == 0) {
            int i = this.a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.a = 2;
            } else if (i2 == 1 || i2 == 2) {
                this.a = 4;
            }
        } else if (iOrdinal == 1) {
            int i3 = this.a;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                this.a = 3;
            } else if (i4 == 1 || i4 == 2 || i4 == 3) {
                this.a = 5;
            }
        } else if (iOrdinal == 2) {
            int i5 = this.a;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 1 || i6 == 2) {
                this.a = 1;
            } else if (i6 == 3) {
                this.a = 2;
            } else if (i6 == 4) {
                this.a = 3;
            }
        }
        return this.a;
    }

    public final synchronized String b(String str) {
        String strValueOf;
        strValueOf = String.valueOf(this.a);
        this.a = (this.a + 1) % 100000;
        return str + ':' + strValueOf;
    }

    public afft() {
    }

    public afft(byte[] bArr, byte[] bArr2) {
        this.a = 0;
    }
}
