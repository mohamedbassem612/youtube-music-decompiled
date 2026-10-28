package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class om {
    public static int a() {
        return a.at();
    }

    public static final void b(View view) {
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            int i = bac.a;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static final void c(RecyclerView recyclerView, View view, float f, float f2, boolean z) {
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            int i = bac.a;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public static final void d() {
        if (rx.d()) {
            MediaStore.getPickImagesMaxLimit();
        }
    }

    public static final yt e(ro roVar) {
        yt ytVar = new yt(null);
        ytVar.a = roVar;
        return ytVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    public static void f(dbd dbdVar, dbm dbmVar, bvh bvhVar) {
        int i;
        boolean z;
        long j = dbmVar.b;
        if (j == -9223372036854775807L) {
            i = 0;
        } else {
            int iB = dbdVar.b(j);
            if (iB == -1) {
                iB = dbdVar.a();
            }
            if (iB > 0) {
                int i2 = iB - 1;
                if (dbdVar.c(i2) == j) {
                    i = i2;
                } else {
                    i = iB;
                }
            } else {
                i = iB;
            }
        }
        if (j == -9223372036854775807L || i >= dbdVar.a()) {
            z = false;
        } else {
            List listE = dbdVar.e(j);
            long jC = dbdVar.c(i);
            if (listE.isEmpty() || j >= jC) {
                z = false;
            } else {
                bvhVar.a(new abnx(listE, j, jC - j));
                z = true;
            }
        }
        for (int i3 = i; i3 < dbdVar.a(); i3++) {
            n(dbdVar, i3, bvhVar);
        }
        if (dbmVar.c) {
            if (z) {
                i--;
            }
            for (int i4 = 0; i4 < i; i4++) {
                n(dbdVar, i4, bvhVar);
            }
            if (z) {
                bvhVar.a(new abnx(dbdVar.e(j), dbdVar.c(i), j - dbdVar.c(i)));
            }
        }
    }

    public static final byte[] g(List list, long j) {
        bwa bwaVar = new bwa(6);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) bwaVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static int h(byte[] bArr) {
        yvh yvhVarM = m(bArr);
        if (yvhVarM == null) {
            return -1;
        }
        return yvhVarM.a;
    }

    public static UUID i(byte[] bArr) {
        yvh yvhVarM = m(bArr);
        if (yvhVarM == null) {
            return null;
        }
        return (UUID) yvhVarM.c;
    }

    public static byte[] j(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length << 4) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || (length = bArr.length) == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static byte[] k(byte[] bArr, UUID uuid) {
        yvh yvhVarM = m(bArr);
        if (yvhVarM != null) {
            Object obj = yvhVarM.c;
            if (uuid.equals(obj)) {
                return (byte[]) yvhVarM.b;
            }
            bvx.e("PsshAtomUtil", "UUID mismatch. Expected: " + uuid.toString() + ", got: " + obj.toString() + '.');
        }
        return null;
    }

    public static String l(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((dal) it.next()).a.g.q;
            if (bsy.n(str2)) {
                return "video/mp4";
            }
            if (bsy.i(str2)) {
                z = true;
            } else if (bsy.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str == null ? "application/mp4" : str;
    }

    public static yvh m(byte[] bArr) {
        UUID[] uuidArr;
        bwb bwbVar = new bwb(bArr);
        if (bwbVar.d < 32) {
            return null;
        }
        bwbVar.P(0);
        int iD = bwbVar.d();
        int i = bwbVar.i();
        if (i != iD) {
            bvx.e("PsshAtomUtil", a.bQ(iD, i, "Advertised atom size (", ") does not match buffer size: "));
            return null;
        }
        int i2 = bwbVar.i();
        if (i2 != 1886614376) {
            bvx.e("PsshAtomUtil", a.bR(i2, "Atom type is not pssh: "));
            return null;
        }
        int i3 = bwbVar.i();
        int i4 = czv.a;
        int i5 = (i3 >> 24) & 255;
        if (i5 > 1) {
            bvx.e("PsshAtomUtil", a.bR(i5, "Unsupported pssh version: "));
            return null;
        }
        UUID uuid = new UUID(bwbVar.v(), bwbVar.v());
        if (i5 == 1) {
            int iQ = bwbVar.q();
            uuidArr = new UUID[iQ];
            for (int i6 = 0; i6 < iQ; i6++) {
                uuidArr[i6] = new UUID(bwbVar.v(), bwbVar.v());
            }
        } else {
            uuidArr = null;
        }
        int iQ2 = bwbVar.q();
        int iD2 = bwbVar.d();
        if (iQ2 != iD2) {
            bvx.e("PsshAtomUtil", a.bQ(iD2, iQ2, "Atom data size (", ") does not match the bytes left: "));
            return null;
        }
        byte[] bArr2 = new byte[iQ2];
        bwbVar.K(bArr2, 0, iQ2);
        return new yvh(uuid, i5, bArr2, uuidArr);
    }

    private static void n(dbd dbdVar, int i, bvh bvhVar) {
        long jC = dbdVar.c(i);
        List listE = dbdVar.e(jC);
        if (listE.isEmpty()) {
            return;
        }
        if (i == dbdVar.a() - 1) {
            throw new IllegalStateException();
        }
        long jC2 = dbdVar.c(i + 1) - dbdVar.c(i);
        if (jC2 > 0) {
            bvhVar.a(new abnx(listE, jC, jC2));
        }
    }
}
