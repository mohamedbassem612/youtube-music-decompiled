package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class aard {
    aauu a;
    private final Key b;
    private boolean c;
    private final aanb d;

    public aard(aanb aanbVar, Key key) {
        this.d = aanbVar;
        this.b = key;
    }

    public final synchronized aare a(aaml aamlVar, boolean z) {
        jsk jskVar;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        aaqi aaqiVar;
        ArrayDeque arrayDeque;
        Object objCopyOf;
        byte[] bArr2;
        try {
            ArrayList arrayList = new ArrayList();
            aaqn aaqnVarB = this.d.b();
            aaqi aaqiVarH = aaqnVarB.h();
            int iA = aaqiVarH.a(aamlVar.g(), aamlVar.a());
            int i5 = 3;
            int i6 = 0;
            if (iA == -1) {
                return aagu.e(aamlVar, 0, arrayList, 3);
            }
            this.c = false;
            aamf aamfVarB = aaqiVarH.b(aamlVar.g(), aamlVar.a(), iA, 0);
            int i7 = 1;
            if (aamfVarB != null && (bArr2 = ((aalw) aamfVarB).a) != null && bArr2.length == 10) {
                this.c = true;
            }
            this.a = new aauu(this.c);
            int iPow = ((int) Math.pow(2.0d, iA)) << 12;
            int iCeil = (int) Math.ceil(aamlVar.b() / ((double) iPow));
            aadc aadcVarC = aaqnVarB.c();
            if (aadcVarC == null) {
                jskVar = null;
                break;
            }
            Iterator it = ((aada) aadcVarC).io().iterator();
            do {
                if (!it.hasNext()) {
                    jskVar = null;
                    break;
                }
                jskVar = (jsk) it.next();
            } while (!jskVar.h().contains(aamlVar.f(z)));
            if (jskVar == null) {
                return aagu.e(aamlVar, 0, arrayList, 3);
            }
            byte[] bArr3 = new byte[iPow];
            int i8 = 0;
            while (i8 < iCeil) {
                aamf aamfVarB2 = aaqiVarH.b(aamlVar.g(), aamlVar.a(), iA, i8);
                int i9 = i7;
                int i10 = iCeil;
                long j = i8 * iPow;
                if (aamfVarB2 == null || ((aalw) aamfVarB2).a == null) {
                    i = iA;
                    i2 = i6;
                    bArr = bArr3;
                    i3 = i8;
                    i4 = i9;
                    aaqiVar = aaqiVarH;
                    aagu.f(j, aamlVar, arrayList);
                } else {
                    aaqiVar = aaqiVarH;
                    i = iA;
                    int iMin = (int) Math.min(iPow, aamlVar.b() - j);
                    byte[] bArr4 = bArr3;
                    int i11 = i8;
                    bxs bxsVar = new bxs(this.b.getEncoded(), new jsn(jskVar, aarb.a, new jsx("Offline"), null, 4, null));
                    String strF = aamlVar.f(z);
                    try {
                        bxsVar.b(new byi(Uri.EMPTY, j, iMin, strF));
                        bxsVar.a(bArr4, i6, iMin);
                        aauu aauuVar = this.a;
                        aauuVar.c.clear();
                        aauuVar.e = i6;
                        boolean z2 = this.c;
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.reset();
                            i3 = i11;
                            int iCeil2 = (int) Math.ceil(((double) iMin) / 4096.0d);
                            int i12 = 0;
                            while (i12 < iCeil2) {
                                int i13 = i12 << 12;
                                int i14 = iMin;
                                boolean z3 = z2;
                                int iMin2 = Math.min(SemanticState.Obscured, i14 - i13);
                                messageDigest.reset();
                                if (iMin2 > 0) {
                                    messageDigest.update(aauu.a);
                                }
                                messageDigest.update(bArr4, i13, iMin2);
                                aauu aauuVar2 = this.a;
                                aauuVar2.c.push(new auzc(0, z3 ? Arrays.copyOf(messageDigest.digest(), 10) : messageDigest.digest()));
                                aauuVar2.e++;
                                aauuVar2.a();
                                i12++;
                                iMin = i14;
                                z2 = z3;
                                bArr4 = bArr4;
                                aamfVarB2 = aamfVarB2;
                            }
                            bArr = bArr4;
                            aamf aamfVar = aamfVarB2;
                            i2 = 0;
                            aauu aauuVar3 = this.a;
                            while (true) {
                                arrayDeque = aauuVar3.c;
                                int i15 = i9;
                                if (arrayDeque.size() <= i15) {
                                    break;
                                }
                                auzc auzcVar = (auzc) arrayDeque.peek();
                                if (auzcVar != null) {
                                    auzcVar.a += i15;
                                    aauuVar3.a();
                                    i9 = 1;
                                } else {
                                    i9 = i15;
                                }
                            }
                            auzc auzcVar2 = (auzc) arrayDeque.peek();
                            i4 = 1;
                            if (arrayDeque.size() != 1 || auzcVar2 == null) {
                                MessageDigest messageDigest2 = aauuVar3.d;
                                messageDigest2.reset();
                                objCopyOf = aauuVar3.f ? Arrays.copyOf(messageDigest2.digest(), 10) : messageDigest2.digest();
                            } else {
                                objCopyOf = auzcVar2.b;
                            }
                            if (!Arrays.equals((byte[]) objCopyOf, ((aalw) aamfVar).a)) {
                                aagu.f(j, aamlVar, arrayList);
                            }
                        } catch (NoSuchAlgorithmException e) {
                            throw new IllegalStateException(e);
                        }
                    } catch (IOException e2) {
                        bArr = bArr4;
                        i2 = i6;
                        i3 = i11;
                        i4 = i9;
                        ((agrc) ((agrc) ((agrc) aarc.a.b()).j(e2)).k("com/google/android/libraries/youtube/offline/streams/OfflineCacheFileReader", "readBytesForStream", '2', "OfflineCacheFileReader.java")).w("Couldn't read from data source for %s\n", strF);
                        aagu.f(j, aamlVar, arrayList);
                    }
                }
                i8 = i3 + 1;
                i7 = i4;
                aaqiVarH = aaqiVar;
                bArr3 = bArr;
                iCeil = i10;
                iA = i;
                i6 = i2;
                i5 = 3;
            }
            return aagu.e(aamlVar, iPow, arrayList, i5);
        } catch (Throwable th) {
            throw th;
        }
    }
}
