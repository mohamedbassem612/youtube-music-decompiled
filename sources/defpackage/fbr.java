package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbr implements eua {
    public static final etx a = new etx("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new fbm(1, null));
    public static final etx b = new etx("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new fbm(0));
    private static final List c = DesugarCollections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    private final fbp d;
    private final ewn e;

    public fbr(ewn ewnVar, fbp fbpVar) {
        this.e = ewnVar;
        this.d = fbpVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134 A[Catch: all -> 0x01ab, TryCatch #4 {all -> 0x01ab, blocks: (B:52:0x0104, B:53:0x0108, B:55:0x0115, B:57:0x0119, B:58:0x011f, B:60:0x0125, B:68:0x0140, B:72:0x015a, B:75:0x016a, B:83:0x01a5, B:84:0x01aa, B:63:0x0134, B:65:0x013a), top: B:106:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013a A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #4 {all -> 0x01ab, blocks: (B:52:0x0104, B:53:0x0108, B:55:0x0115, B:57:0x0119, B:58:0x011f, B:60:0x0125, B:68:0x0140, B:72:0x015a, B:75:0x016a, B:83:0x01a5, B:84:0x01aa, B:63:0x0134, B:65:0x013a), top: B:106:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a5 A[Catch: all -> 0x01ab, TRY_ENTER, TryCatch #4 {all -> 0x01ab, blocks: (B:52:0x0104, B:53:0x0108, B:55:0x0115, B:57:0x0119, B:58:0x011f, B:60:0x0125, B:68:0x0140, B:72:0x015a, B:75:0x016a, B:83:0x01a5, B:84:0x01aa, B:63:0x0134, B:65:0x013a), top: B:106:0x0104 }] */
    @Override // defpackage.eua
    public final ewf a(Object obj, int i, int i2, ety etyVar) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever;
        long j;
        int i3;
        Bitmap bitmapCreateBitmap;
        int i4;
        MediaExtractor mediaExtractor;
        long jLongValue = ((Long) etyVar.b(a)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(a.bS(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) etyVar.b(b);
        if (num == null) {
            num = 2;
        }
        fam famVar = (fam) etyVar.b(fam.g);
        if (famVar == null) {
            famVar = fam.f;
        }
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        try {
            fbp fbpVar = this.d;
            fbpVar.b(mediaMetadataRetriever2, obj);
            int iIntValue = num.intValue();
            Bitmap frameAtTime = null;
            if (Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+")) {
                try {
                    if ("video/webm".equals(mediaMetadataRetriever2.extractMetadata(12))) {
                        mediaExtractor = new MediaExtractor();
                        try {
                            fbpVar.a(mediaExtractor, obj);
                            int trackCount = mediaExtractor.getTrackCount();
                            for (int i5 = 0; i5 < trackCount; i5++) {
                                if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i5).getString("mime"))) {
                                    mediaExtractor.release();
                                    throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                                }
                            }
                        } catch (Throwable unused) {
                            if (mediaExtractor != null) {
                            }
                            if (Build.VERSION.SDK_INT >= 27) {
                                j = jLongValue;
                                i3 = iIntValue;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                            } else {
                                j = jLongValue;
                                i3 = iIntValue;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                            }
                            if (frameAtTime == null) {
                                try {
                                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, i3);
                                } catch (Throwable th) {
                                    th = th;
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        mediaMetadataRetriever.close();
                                    } else {
                                        mediaMetadataRetriever.release();
                                    }
                                    throw th;
                                }
                            }
                            bitmapCreateBitmap = frameAtTime;
                            if (!Build.MODEL.startsWith("Pixel")) {
                                if (Build.VERSION.SDK_INT >= 30) {
                                    try {
                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                        i4 = Integer.parseInt(strExtractMetadata);
                                        int i6 = Integer.parseInt(strExtractMetadata2);
                                        if (i4 != 7) {
                                            Matrix matrix = new Matrix();
                                            matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                        } else {
                                            Matrix matrix2 = new Matrix();
                                            matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                            } else if (Build.VERSION.SDK_INT >= 30) {
                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                i4 = Integer.parseInt(strExtractMetadata3);
                                int i7 = Integer.parseInt(strExtractMetadata4);
                                if (i4 != 7) {
                                    Matrix matrix3 = new Matrix();
                                    matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                } else {
                                    Matrix matrix4 = new Matrix();
                                    matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                throw new fbq();
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                mediaMetadataRetriever.close();
                            } else {
                                mediaMetadataRetriever.release();
                            }
                            return ezw.f(bitmapCreateBitmap, this.e);
                        }
                        mediaExtractor.release();
                    }
                } catch (Throwable unused3) {
                    mediaExtractor = null;
                }
            }
            if (Build.VERSION.SDK_INT >= 27 || i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || famVar == fam.e) {
                j = jLongValue;
                i3 = iIntValue;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            } else {
                try {
                    int i8 = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(18));
                    int i9 = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(19));
                    int i10 = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                    if (i10 == 90 || i10 == 270) {
                        i9 = i8;
                        i8 = i9;
                    }
                    float fA = famVar.a(i8, i9, i, i2);
                    int iRound = Math.round(i8 * fA);
                    int iRound2 = Math.round(fA * i9);
                    j = jLongValue;
                    i3 = iIntValue;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    try {
                        frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i3, iRound, iRound2);
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    j = jLongValue;
                    i3 = iIntValue;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                }
            }
            if (frameAtTime == null) {
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, i3);
            }
            bitmapCreateBitmap = frameAtTime;
            if (!Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
                Iterator it = c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Build.ID.startsWith((String) it.next())) {
                            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                            i4 = Integer.parseInt(strExtractMetadata5);
                            int i11 = Integer.parseInt(strExtractMetadata6);
                            if (i4 != 7) {
                                Matrix matrix5 = new Matrix();
                                matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                            } else {
                                Matrix matrix6 = new Matrix();
                                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
                            }
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
                i4 = Integer.parseInt(strExtractMetadata7);
                int i12 = Integer.parseInt(strExtractMetadata8);
                if ((i4 != 7 || i4 == 6) && i12 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Matrix matrix7 = new Matrix();
                    matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
                }
            }
            if (bitmapCreateBitmap != null) {
                throw new fbq();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
            return ezw.f(bitmapCreateBitmap, this.e);
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever = mediaMetadataRetriever2;
        }
    }

    @Override // defpackage.eua
    public final boolean b(Object obj, ety etyVar) {
        return true;
    }
}
