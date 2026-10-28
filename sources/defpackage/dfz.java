package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dfz extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    final /* synthetic */ dge c;
    private int d;
    private long e;

    public dfz(dge dgeVar) {
        this.c = dgeVar;
        MediaDescriptionCompat mediaDescriptionCompat = dgeVar.D;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.d;
        if (dge.w(bitmap)) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dgeVar.D;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.e : null;
    }

    private final InputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.c.e.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            int i = dge.b;
            uRLConnectionOpenConnection.setConnectTimeout(i);
            uRLConnectionOpenConnection.setReadTimeout(i);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00aa: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:171), block:B:41:0x00aa */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) throws Throwable {
        Bitmap bitmap;
        int i;
        boolean z;
        Bitmap bitmap2;
        ?? r19;
        InputStream inputStream;
        InputStream inputStreamA;
        Bitmap bitmapDecodeStream = this.a;
        int i2 = 0;
        boolean z2 = true;
        InputStream inputStream2 = null;
        if (bitmapDecodeStream == null) {
            Uri uri = this.b;
            try {
                if (uri != null) {
                    try {
                        inputStreamA = a(uri);
                        try {
                            if (inputStreamA == null) {
                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                return null;
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(inputStreamA, null, options);
                            if (options.outWidth != 0 && options.outHeight != 0) {
                                try {
                                    inputStreamA.reset();
                                } catch (IOException unused) {
                                    inputStreamA.close();
                                    Uri uri2 = this.b;
                                    inputStreamA = a(uri2);
                                    if (inputStreamA == null) {
                                        Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri2);
                                        return null;
                                    }
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.c.h(options.outWidth, options.outHeight)));
                                if (!isCancelled()) {
                                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamA, null, options);
                                    if (inputStreamA != null) {
                                        try {
                                            inputStreamA.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } else if (inputStreamA == null) {
                                    return null;
                                }
                            }
                            try {
                                inputStreamA.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException e) {
                            e = e;
                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.b, e);
                            if (inputStreamA != null) {
                                try {
                                    inputStreamA.close();
                                } catch (IOException unused4) {
                                }
                            }
                            bitmapDecodeStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        inputStreamA = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } else {
                    bitmapDecodeStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        if (dge.w(bitmapDecodeStream)) {
            Objects.toString(bitmapDecodeStream);
            Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: ".concat(String.valueOf(bitmapDecodeStream)));
            return null;
        }
        if (bitmapDecodeStream == null || bitmapDecodeStream.getWidth() >= bitmapDecodeStream.getHeight()) {
            bitmap = bitmapDecodeStream;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (bitmapDecodeStream.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(djy.a);
            arrayList.add(djz.a);
            arrayList.add(djz.b);
            arrayList.add(djz.c);
            arrayList.add(djz.d);
            arrayList.add(djz.e);
            arrayList.add(djz.f);
            int width = bitmapDecodeStream.getWidth() * bitmapDecodeStream.getHeight();
            double dSqrt = width > 12544 ? Math.sqrt(12544.0d / ((double) width)) : -1.0d;
            Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmapDecodeStream : Bitmap.createScaledBitmap(bitmapDecodeStream, (int) Math.ceil(((double) bitmapDecodeStream.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmapDecodeStream.getHeight()) * dSqrt), false);
            int width2 = bitmapCreateScaledBitmap.getWidth();
            int height = bitmapCreateScaledBitmap.getHeight();
            int[] iArr = new int[width2 * height];
            bitmapCreateScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
            djw djwVar = new djw(iArr, 1, arrayList2.isEmpty() ? null : (vz[]) arrayList2.toArray(new vz[arrayList2.size()]));
            if (bitmapCreateScaledBitmap != bitmapDecodeStream) {
                bitmapCreateScaledBitmap.recycle();
            }
            List list = djwVar.c;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            aha ahaVar = new aha(0);
            int size = list.size();
            int i3 = Integer.MIN_VALUE;
            djx djxVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                djx djxVar2 = (djx) list.get(i4);
                int i5 = djxVar2.b;
                if (i5 > i3) {
                    djxVar = djxVar2;
                    i3 = i5;
                }
            }
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                djz djzVar = (djz) arrayList.get(i6);
                float f = 0.0f;
                int i7 = i2;
                float f2 = 0.0f;
                while (true) {
                    if (i7 >= 3) {
                        break;
                    }
                    float f3 = djzVar.i[i7];
                    if (f3 > 0.0f) {
                        f2 += f3;
                    }
                    i7++;
                }
                if (f2 != 0.0f) {
                    int i8 = i2;
                    for (i = 3; i8 < i; i = 3) {
                        float[] fArr = djzVar.i;
                        float f4 = fArr[i8];
                        if (f4 > 0.0f) {
                            fArr[i8] = f4 / f2;
                        }
                        i8++;
                    }
                }
                int size3 = list.size();
                int i9 = i2;
                float f5 = 0.0f;
                djx djxVar3 = null;
                ?? r5 = z2;
                while (i9 < size3) {
                    float f6 = f;
                    djx djxVar4 = (djx) list.get(i9);
                    float[] fArrA = djxVar4.a();
                    float f7 = fArrA[r5];
                    int i10 = i2;
                    float[] fArr2 = djzVar.g;
                    if (f7 < fArr2[i10] || f7 > fArr2[2]) {
                        bitmap2 = bitmapDecodeStream;
                        arrayList = arrayList;
                        r19 = r5;
                    } else {
                        float f8 = fArrA[2];
                        r19 = r5;
                        float[] fArr3 = djzVar.h;
                        if (f8 < fArr3[i10] || f8 > fArr3[2]) {
                            bitmap2 = bitmapDecodeStream;
                        } else {
                            bitmap2 = bitmapDecodeStream;
                            if (!sparseBooleanArray.get(djxVar4.a)) {
                                float[] fArrA2 = djxVar4.a();
                                float fC = (djzVar.c() > f6 ? djzVar.c() * (1.0f - Math.abs(fArrA2[r19 == true ? 1 : 0] - fArr2[r19 == true ? 1 : 0])) : f6) + (djzVar.a() > f6 ? djzVar.a() * (1.0f - Math.abs(fArrA2[2] - fArr3[r19 == true ? 1 : 0])) : f6) + (djzVar.b() > f6 ? djzVar.b() * (djxVar4.b / (djxVar != null ? djxVar.b : r19 == true ? 1 : 0)) : f6);
                                if (djxVar3 == null || fC > f5) {
                                    djxVar3 = djxVar4;
                                    f5 = fC;
                                }
                            }
                        }
                        arrayList = arrayList;
                    }
                    i9++;
                    bitmapDecodeStream = bitmap2;
                    f = f6;
                    r5 = r19;
                    i2 = i10;
                    arrayList = arrayList;
                }
                Bitmap bitmap3 = bitmapDecodeStream;
                ArrayList arrayList3 = arrayList;
                int i11 = i2;
                ?? r110 = r5;
                if (djxVar3 != null) {
                    boolean z3 = djzVar.j;
                    int i12 = djxVar3.a;
                    z = r110 == true ? 1 : 0;
                    sparseBooleanArray.append(i12, z);
                } else {
                    z = r110 == true ? 1 : 0;
                    djxVar3 = null;
                }
                ahaVar.put(djzVar, djxVar3);
                i6++;
                z2 = z;
                bitmapDecodeStream = bitmap3;
                i2 = i11;
                arrayList = arrayList3;
            }
            bitmap = bitmapDecodeStream;
            int i13 = i2;
            sparseBooleanArray.clear();
            this.d = djy.a(list).isEmpty() ? i13 : ((djx) djy.a(list).get(i13)).a;
        }
        return bitmap;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        dge dgeVar = this.c;
        Bitmap bitmap = (Bitmap) obj;
        dgeVar.E = null;
        Bitmap bitmap2 = dgeVar.F;
        Bitmap bitmap3 = this.a;
        if (j$.util.Objects.equals(bitmap2, bitmap3) && j$.util.Objects.equals(dgeVar.G, this.b)) {
            return;
        }
        dgeVar.F = bitmap3;
        dgeVar.I = bitmap;
        dgeVar.G = this.b;
        dgeVar.J = this.d;
        dgeVar.H = true;
        dgeVar.q(SystemClock.uptimeMillis() - this.e > 120);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.e = SystemClock.uptimeMillis();
        this.c.m();
    }
}
