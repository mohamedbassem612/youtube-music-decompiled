package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fap {
    public static final etx a = new etx("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", etg.c, etx.a);
    public static final etx b = new etx("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, etx.a);
    public static final etx c;
    public static final etx d;
    public static final etx e;
    public static final etx f;
    public static final fao g;
    private static final Queue k;
    public final List h;
    public final ewv i;
    public final dov j;
    private final ewn l;
    private final DisplayMetrics m;
    private final fax n = fax.a();

    static {
        fam famVar = fam.b;
        Boolean bool = Boolean.FALSE;
        c = new etx("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool, etx.a);
        d = new etx("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool, etx.a);
        e = new etx("com.bumptech.glide.load.resource.bitmap.Downsampler.BypassTransformationsForHardwareBitmaps", bool, etx.a);
        f = new etx("com.bumptech.glide.load.resource.bitmap.Downsampler.IsExifOrientationRequired", bool, etx.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        g = new fan();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = ffs.a;
        k = new ArrayDeque(0);
    }

    public fap(List list, DisplayMetrics displayMetrics, ewn ewnVar, ewv ewvVar, dov dovVar) {
        this.h = list;
        if (displayMetrics == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.m = displayMetrics;
        if (ewnVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.l = ewnVar;
        if (ewvVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.i = ewvVar;
        this.j = dovVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap c(defpackage.fbb r13, android.graphics.BitmapFactory.Options r14, defpackage.fao r15, defpackage.ewn r16) {
        /*
            java.lang.String r1 = "["
            java.lang.String r2 = "Exception decoding bitmap, outWidth: "
            java.lang.String r3 = " ("
            boolean r0 = r14.inJustDecodeBounds
            if (r0 != 0) goto L10
            r15.b()
            r13.d()
        L10:
            int r4 = r14.outWidth
            int r5 = r14.outHeight
            java.lang.String r6 = r14.outMimeType
            java.util.concurrent.locks.Lock r0 = defpackage.fbk.d
            r0.lock()
            android.graphics.Bitmap r13 = r13.b(r14)     // Catch: java.lang.IllegalArgumentException -> L21 java.lang.Throwable -> Laf
            goto La7
        L21:
            r0 = move-exception
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> Laf
            android.graphics.Bitmap r8 = r14.inBitmap     // Catch: java.lang.Throwable -> Laf
            r9 = 0
            if (r8 != 0) goto L2b
            r1 = r9
            goto L6f
        L2b:
            int r10 = r8.getAllocationByteCount()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r11.<init>(r3)     // Catch: java.lang.Throwable -> Laf
            r11.append(r10)     // Catch: java.lang.Throwable -> Laf
            r3 = 41
            r11.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Throwable -> Laf
            int r10 = r8.getWidth()     // Catch: java.lang.Throwable -> Laf
            int r11 = r8.getHeight()     // Catch: java.lang.Throwable -> Laf
            android.graphics.Bitmap$Config r8 = r8.getConfig()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r12.<init>(r1)     // Catch: java.lang.Throwable -> Laf
            r12.append(r10)     // Catch: java.lang.Throwable -> Laf
            r1 = 120(0x78, float:1.68E-43)
            r12.append(r1)     // Catch: java.lang.Throwable -> Laf
            r12.append(r11)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = "] "
            r12.append(r1)     // Catch: java.lang.Throwable -> Laf
            r12.append(r8)     // Catch: java.lang.Throwable -> Laf
            r12.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r12.toString()     // Catch: java.lang.Throwable -> Laf
        L6f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r4)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = ", outHeight: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = ", outMimeType: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = ", inBitmap: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Laf
            r3.append(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Laf
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> Laf
            android.graphics.Bitmap r0 = r14.inBitmap     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lae
            android.graphics.Bitmap r0 = r14.inBitmap     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
            r1 = r16
            r1.d(r0)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
            r14.inBitmap = r9     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
            android.graphics.Bitmap r13 = c(r13, r14, r15, r16)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Laf
        La7:
            java.util.concurrent.locks.Lock r14 = defpackage.fbk.d
            r14.unlock()
            return r13
        Lad:
            throw r7     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r7     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            r13 = r0
            java.util.concurrent.locks.Lock r14 = defpackage.fbk.d
            r14.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fap.c(fbb, android.graphics.BitmapFactory$Options, fao, ewn):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options d() {
        BitmapFactory.Options options;
        Queue queue = k;
        synchronized (queue) {
            try {
                options = (BitmapFactory.Options) queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            e(options);
        }
        return options;
    }

    private static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean f(int i) {
        return i == 90 || i == 270;
    }

    private static boolean g(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] h(fbb fbbVar, BitmapFactory.Options options, fao faoVar, ewn ewnVar) {
        options.inJustDecodeBounds = true;
        c(fbbVar, options, faoVar, ewnVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ewf a(fbb fbbVar, int i, int i2, ety etyVar, fao faoVar) throws Throwable {
        int i3;
        byte[] bArr;
        int i4;
        float f2;
        Bitmap.Config config;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        int iFloor;
        int iFloor2;
        dov dovVar;
        byte[] bArr2 = (byte[]) this.i.a(65536, byte[].class);
        BitmapFactory.Options optionsD = d();
        optionsD.inTempStorage = bArr2;
        etg etgVar = (etg) etyVar.b(a);
        etz etzVar = (etz) etyVar.b(b);
        fam famVar = (fam) etyVar.b(fam.g);
        if (famVar == fam.f && (dovVar = this.j) != null && dovVar.m(ery.class)) {
            famVar = fam.c;
        }
        boolean zBooleanValue = ((Boolean) etyVar.b(c)).booleanValue();
        etx etxVar = d;
        boolean z = etyVar.b(etxVar) != null && ((Boolean) etyVar.b(etxVar)).booleanValue();
        try {
            double d2 = ffn.a;
            SystemClock.elapsedRealtimeNanos();
            ewn ewnVar = this.l;
            int[] iArrH = h(fbbVar, optionsD, faoVar, ewnVar);
            int i5 = iArrH[0];
            int i6 = iArrH[1];
            String str = optionsD.outMimeType;
            if (i5 == -1) {
                z = false;
            } else if (i6 == -1) {
                i6 = -1;
                z = false;
            }
            int iA = fbbVar.a();
            Paint paint = fbk.a;
            switch (iA) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 6:
                    i3 = 90;
                    break;
                case 7:
                case 8:
                    i3 = 270;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            boolean zC = fbk.c(iA);
            int iRound = i;
            if (iRound == Integer.MIN_VALUE) {
                bArr = bArr2;
                iRound = f(i3) ? i6 : i5;
            } else {
                bArr = bArr2;
            }
            int iRound2 = i2;
            if (iRound2 == Integer.MIN_VALUE) {
                try {
                    iRound2 = f(i3) ? i5 : i6;
                } catch (Throwable th) {
                    th = th;
                    bArr2 = bArr;
                    e(optionsD);
                    Queue queue = k;
                    synchronized (queue) {
                        queue.offer(optionsD);
                    }
                    this.i.c(bArr2);
                    throw th;
                }
            }
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = fbbVar.c();
            if (i5 <= 0 || i6 <= 0) {
                i4 = i5;
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
                boolean zF = f(i3);
                int i7 = true != zF ? i6 : i5;
                int i8 = true != zF ? i5 : i6;
                float fA = famVar.a(i8, i7, iRound, iRound2);
                if (fA <= 0.0f) {
                    throw new IllegalArgumentException("Cannot scale with factor: " + fA + " from: " + String.valueOf(famVar) + ", source: [" + i5 + 'x' + i6 + "], target: [" + iRound + 'x' + iRound2 + ']');
                }
                int iB = famVar.b(i8, i7, iRound, iRound2);
                float f3 = i8;
                int i9 = i8;
                float f4 = fA * f3;
                float f5 = i7;
                int i10 = i7;
                int i11 = i9 / ((int) (((double) f4) + 0.5d));
                int i12 = i10 / ((int) (((double) (fA * f5)) + 0.5d));
                int iMax = Math.max(1, Integer.highestOneBit(iB == 1 ? Math.max(i11, i12) : Math.min(i11, i12)));
                if (iB == 1 && iMax < 1.0f / fA) {
                    iMax <<= 1;
                }
                optionsD.inSampleSize = iMax;
                if (imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.JPEG) {
                    float fMin = Math.min(iMax, 8);
                    iFloor = (int) Math.ceil(f3 / fMin);
                    iFloor2 = (int) Math.ceil(f5 / fMin);
                    int i13 = iMax / 8;
                    if (i13 > 0) {
                        iFloor /= i13;
                        iFloor2 /= i13;
                    }
                } else if (imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.PNG_A) {
                    float f6 = iMax;
                    iFloor = (int) Math.floor(f3 / f6);
                    iFloor2 = (int) Math.floor(f5 / f6);
                } else if (imageHeaderParser$ImageTypeC.isWebp()) {
                    float f7 = iMax;
                    iFloor = Math.round(f3 / f7);
                    iFloor2 = Math.round(f5 / f7);
                } else if (i9 % iMax == 0 && i10 % iMax == 0) {
                    iFloor = i9 / iMax;
                    iFloor2 = i10 / iMax;
                } else {
                    int[] iArrH2 = h(fbbVar, optionsD, faoVar, ewnVar);
                    iFloor = iArrH2[0];
                    iFloor2 = iArrH2[1];
                }
                double dA = famVar.a(iFloor, iFloor2, iRound, iRound2);
                int iB2 = b(dA);
                int i14 = (int) ((((double) iB2) * dA) + 0.5d);
                optionsD.inTargetDensity = (int) (((dA / ((double) (i14 / iB2))) * ((double) i14)) + 0.5d);
                optionsD.inDensity = b(dA);
                if (g(optionsD)) {
                    optionsD.inScaled = true;
                } else {
                    optionsD.inTargetDensity = 0;
                    optionsD.inDensity = 0;
                }
                i4 = i5;
            }
            if (this.n.b(iRound, iRound2, z, zC)) {
                optionsD.inPreferredConfig = Bitmap.Config.HARDWARE;
                optionsD.inMutable = false;
            } else if (etgVar != etg.a) {
                try {
                    config = fbbVar.c().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                } catch (IOException unused) {
                }
                optionsD.inPreferredConfig = config;
                if (optionsD.inPreferredConfig == Bitmap.Config.RGB_565) {
                    optionsD.inDither = true;
                }
            } else {
                optionsD.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            int i15 = optionsD.inSampleSize;
            if (i4 < 0 || i6 < 0 || !zBooleanValue) {
                float f8 = g(optionsD) ? optionsD.inTargetDensity / optionsD.inDensity : f2;
                float f9 = optionsD.inSampleSize;
                int iCeil = (int) Math.ceil(i4 / f9);
                int iCeil2 = (int) Math.ceil(i6 / f9);
                iRound = Math.round(iCeil * f8);
                iRound2 = Math.round(iCeil2 * f8);
            }
            if (iRound > 0 && iRound2 > 0) {
                ewn ewnVar2 = this.l;
                dov dovVar2 = this.j;
                if (optionsD.inPreferredConfig != Bitmap.Config.HARDWARE) {
                    Bitmap.Config config2 = optionsD.outConfig;
                    if (config2 == Bitmap.Config.ARGB_8888 && optionsD.inPreferredConfig == Bitmap.Config.RGB_565 && dovVar2 != null && dovVar2.m(erq.class)) {
                        config2 = Bitmap.Config.RGB_565;
                    }
                    if (config2 == null) {
                        config2 = optionsD.inPreferredConfig;
                    }
                    optionsD.inBitmap = ewnVar2.b(iRound, iRound2, config2);
                }
            }
            if (etzVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    optionsD.inPreferredColorSpace = ColorSpace.get((etzVar == etz.b && optionsD.outColorSpace != null && optionsD.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                } else {
                    optionsD.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            ewn ewnVar3 = this.l;
            Bitmap bitmapC = c(fbbVar, optionsD, faoVar, ewnVar3);
            faoVar.a(ewnVar3, bitmapC);
            ezw ezwVar = null;
            if (bitmapC != null) {
                bitmapC.setDensity(this.m.densityDpi);
                if (fbk.c(iA)) {
                    Matrix matrix = new Matrix();
                    switch (iA) {
                        case 2:
                            matrix.setScale(-1.0f, f2);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, f2);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, f2);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                } else {
                    bitmapCreateBitmap = bitmapC;
                }
                boolean zEquals = bitmapC.equals(bitmapCreateBitmap);
                bitmap = bitmapCreateBitmap;
                if (!zEquals) {
                    ewnVar3.d(bitmapC);
                }
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap = bitmapCreateBitmap;
                ezwVar = new ezw(bitmap, ewnVar3);
            }
            bitmap = bitmapCreateBitmap;
            e(optionsD);
            Queue queue2 = k;
            synchronized (queue2) {
                queue2.offer(optionsD);
            }
            this.i.c(bArr);
            return ezwVar;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
