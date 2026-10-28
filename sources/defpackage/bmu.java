package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmu {
    private static final byte[] B;
    private static final byte[] C;
    private static final byte[] D;
    private static final byte[] E;
    private static final byte[] F;
    private static final byte[] G;
    private static final byte[] H;
    private static final byte[] I;
    private static final byte[] J;
    private static final byte[] K;
    private static final byte[] L;
    private static final byte[] M;
    private static final byte[] N;
    private static final byte[] O;
    private static final byte[] P;
    private static final byte[] Q;
    private static final SimpleDateFormat R;
    private static final SimpleDateFormat S;
    private static final bms[] T;
    private static final bms[] U;
    private static final bms[] V;
    private static final bms[] W;
    private static final bms[] X;
    private static final bms Y;
    private static final bms[] Z;
    public static final int[] a;
    private static final bms[] aa;
    private static final bms[] ab;
    private static final bms[] ac;
    private static final bms[] ad;
    private static final HashMap[] ae;
    private static final HashMap af;
    public static final int[] b;
    static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final String[] f;
    public static final int[] g;
    public static final byte[] h;
    public static final bms[][] i;
    public static final HashMap[] j;
    public static final Set k;
    public static final Charset l;
    public static final byte[] m;
    public static final byte[] n;
    public boolean A;
    private AssetManager.AssetInputStream ag;
    private final Set ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    public String o;
    public FileDescriptor p;
    public int q;
    public final HashMap[] r;
    public ByteOrder s;
    public boolean t;
    public boolean u;
    public boolean v;
    public byte[] w;
    public int x;
    public int y;
    public bmr z;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        B = new byte[]{102, 116, 121, 112};
        C = new byte[]{109, 105, 102, 49};
        D = new byte[]{104, 101, 105, 99};
        E = new byte[]{97, 118, 105, 102};
        F = new byte[]{97, 118, 105, 115};
        G = new byte[]{79, 76, 89, 77, 80, 0};
        H = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        d = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        e = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        I = new byte[]{82, 73, 70, 70};
        J = new byte[]{87, 69, 66, 80};
        K = new byte[]{69, 88, 73, 70};
        L = new byte[]{-99, 1, 42};
        M = "VP8X".getBytes(Charset.defaultCharset());
        N = "VP8L".getBytes(Charset.defaultCharset());
        O = "VP8 ".getBytes(Charset.defaultCharset());
        P = "ANIM".getBytes(Charset.defaultCharset());
        Q = "ANMF".getBytes(Charset.defaultCharset());
        f = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        g = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        h = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        bms[] bmsVarArr = {new bms("NewSubfileType", 254, 4), new bms("SubfileType", 255, 4), new bms("ImageWidth", SemanticState.Hidden, 3, 4), new bms("ImageLength", 257, 3, 4), new bms("BitsPerSample", 258, 3), new bms("Compression", 259, 3), new bms("PhotometricInterpretation", 262, 3), new bms("ImageDescription", 270, 2), new bms("Make", 271, 2), new bms("Model", 272, 2), new bms("StripOffsets", 273, 3, 4), new bms("Orientation", 274, 3), new bms("SamplesPerPixel", 277, 3), new bms("RowsPerStrip", 278, 3, 4), new bms("StripByteCounts", 279, 3, 4), new bms("XResolution", 282, 5), new bms("YResolution", 283, 5), new bms("PlanarConfiguration", 284, 3), new bms("ResolutionUnit", 296, 3), new bms("TransferFunction", 301, 3), new bms("Software", 305, 2), new bms("DateTime", 306, 2), new bms("Artist", 315, 2), new bms("WhitePoint", 318, 5), new bms("PrimaryChromaticities", 319, 5), new bms("SubIFDPointer", 330, 4), new bms("JPEGInterchangeFormat", 513, 4), new bms("JPEGInterchangeFormatLength", 514, 4), new bms("YCbCrCoefficients", 529, 5), new bms("YCbCrSubSampling", 530, 3), new bms("YCbCrPositioning", 531, 3), new bms("ReferenceBlackWhite", 532, 5), new bms("Copyright", 33432, 2), new bms("ExifIFDPointer", 34665, 4), new bms("GPSInfoIFDPointer", 34853, 4), new bms("SensorTopBorder", 4, 4), new bms("SensorLeftBorder", 5, 4), new bms("SensorBottomBorder", 6, 4), new bms("SensorRightBorder", 7, 4), new bms("ISO", 23, 3), new bms("JpgFromRaw", 46, 7), new bms("Xmp", 700, 1)};
        T = bmsVarArr;
        bms[] bmsVarArr2 = {new bms("ExposureTime", 33434, 5), new bms("FNumber", 33437, 5), new bms("ExposureProgram", 34850, 3), new bms("SpectralSensitivity", 34852, 2), new bms("PhotographicSensitivity", 34855, 3), new bms("OECF", 34856, 7), new bms("SensitivityType", 34864, 3), new bms("StandardOutputSensitivity", 34865, 4), new bms("RecommendedExposureIndex", 34866, 4), new bms("ISOSpeed", 34867, 4), new bms("ISOSpeedLatitudeyyy", 34868, 4), new bms("ISOSpeedLatitudezzz", 34869, 4), new bms("ExifVersion", 36864, 2), new bms("DateTimeOriginal", 36867, 2), new bms("DateTimeDigitized", 36868, 2), new bms("OffsetTime", 36880, 2), new bms("OffsetTimeOriginal", 36881, 2), new bms("OffsetTimeDigitized", 36882, 2), new bms("ComponentsConfiguration", 37121, 7), new bms("CompressedBitsPerPixel", 37122, 5), new bms("ShutterSpeedValue", 37377, 10), new bms("ApertureValue", 37378, 5), new bms("BrightnessValue", 37379, 10), new bms("ExposureBiasValue", 37380, 10), new bms("MaxApertureValue", 37381, 5), new bms("SubjectDistance", 37382, 5), new bms("MeteringMode", 37383, 3), new bms("LightSource", 37384, 3), new bms("Flash", 37385, 3), new bms("FocalLength", 37386, 5), new bms("SubjectArea", 37396, 3), new bms("MakerNote", 37500, 7), new bms("UserComment", 37510, 7), new bms("SubSecTime", 37520, 2), new bms("SubSecTimeOriginal", 37521, 2), new bms("SubSecTimeDigitized", 37522, 2), new bms("FlashpixVersion", 40960, 7), new bms("ColorSpace", 40961, 3), new bms("PixelXDimension", 40962, 3, 4), new bms("PixelYDimension", 40963, 3, 4), new bms("RelatedSoundFile", 40964, 2), new bms("InteroperabilityIFDPointer", 40965, 4), new bms("FlashEnergy", 41483, 5), new bms("SpatialFrequencyResponse", 41484, 7), new bms("FocalPlaneXResolution", 41486, 5), new bms("FocalPlaneYResolution", 41487, 5), new bms("FocalPlaneResolutionUnit", 41488, 3), new bms("SubjectLocation", 41492, 3), new bms("ExposureIndex", 41493, 5), new bms("SensingMethod", 41495, 3), new bms("FileSource", 41728, 7), new bms("SceneType", 41729, 7), new bms("CFAPattern", 41730, 7), new bms("CustomRendered", 41985, 3), new bms("ExposureMode", 41986, 3), new bms("WhiteBalance", 41987, 3), new bms("DigitalZoomRatio", 41988, 5), new bms("FocalLengthIn35mmFilm", 41989, 3), new bms("SceneCaptureType", 41990, 3), new bms("GainControl", 41991, 3), new bms("Contrast", 41992, 3), new bms("Saturation", 41993, 3), new bms("Sharpness", 41994, 3), new bms("DeviceSettingDescription", 41995, 7), new bms("SubjectDistanceRange", 41996, 3), new bms("ImageUniqueID", 42016, 2), new bms("CameraOwnerName", 42032, 2), new bms("BodySerialNumber", 42033, 2), new bms("LensSpecification", 42034, 5), new bms("LensMake", 42035, 2), new bms("LensModel", 42036, 2), new bms("Gamma", 42240, 5), new bms("DNGVersion", 50706, 1), new bms("DefaultCropSize", 50720, 3, 4)};
        U = bmsVarArr2;
        bms[] bmsVarArr3 = {new bms("GPSVersionID", 0, 1), new bms("GPSLatitudeRef", 1, 2), new bms("GPSLatitude", 2, 5, 10), new bms("GPSLongitudeRef", 3, 2), new bms("GPSLongitude", 4, 5, 10), new bms("GPSAltitudeRef", 5, 1), new bms("GPSAltitude", 6, 5), new bms("GPSTimeStamp", 7, 5), new bms("GPSSatellites", 8, 2), new bms("GPSStatus", 9, 2), new bms("GPSMeasureMode", 10, 2), new bms("GPSDOP", 11, 5), new bms("GPSSpeedRef", 12, 2), new bms("GPSSpeed", 13, 5), new bms("GPSTrackRef", 14, 2), new bms("GPSTrack", 15, 5), new bms("GPSImgDirectionRef", 16, 2), new bms("GPSImgDirection", 17, 5), new bms("GPSMapDatum", 18, 2), new bms("GPSDestLatitudeRef", 19, 2), new bms("GPSDestLatitude", 20, 5), new bms("GPSDestLongitudeRef", 21, 2), new bms("GPSDestLongitude", 22, 5), new bms("GPSDestBearingRef", 23, 2), new bms("GPSDestBearing", 24, 5), new bms("GPSDestDistanceRef", 25, 2), new bms("GPSDestDistance", 26, 5), new bms("GPSProcessingMethod", 27, 7), new bms("GPSAreaInformation", 28, 7), new bms("GPSDateStamp", 29, 2), new bms("GPSDifferential", 30, 3), new bms("GPSHPositioningError", 31, 5)};
        V = bmsVarArr3;
        bms[] bmsVarArr4 = {new bms("InteroperabilityIndex", 1, 2)};
        W = bmsVarArr4;
        bms[] bmsVarArr5 = {new bms("NewSubfileType", 254, 4), new bms("SubfileType", 255, 4), new bms("ThumbnailImageWidth", SemanticState.Hidden, 3, 4), new bms("ThumbnailImageLength", 257, 3, 4), new bms("BitsPerSample", 258, 3), new bms("Compression", 259, 3), new bms("PhotometricInterpretation", 262, 3), new bms("ImageDescription", 270, 2), new bms("Make", 271, 2), new bms("Model", 272, 2), new bms("StripOffsets", 273, 3, 4), new bms("ThumbnailOrientation", 274, 3), new bms("SamplesPerPixel", 277, 3), new bms("RowsPerStrip", 278, 3, 4), new bms("StripByteCounts", 279, 3, 4), new bms("XResolution", 282, 5), new bms("YResolution", 283, 5), new bms("PlanarConfiguration", 284, 3), new bms("ResolutionUnit", 296, 3), new bms("TransferFunction", 301, 3), new bms("Software", 305, 2), new bms("DateTime", 306, 2), new bms("Artist", 315, 2), new bms("WhitePoint", 318, 5), new bms("PrimaryChromaticities", 319, 5), new bms("SubIFDPointer", 330, 4), new bms("JPEGInterchangeFormat", 513, 4), new bms("JPEGInterchangeFormatLength", 514, 4), new bms("YCbCrCoefficients", 529, 5), new bms("YCbCrSubSampling", 530, 3), new bms("YCbCrPositioning", 531, 3), new bms("ReferenceBlackWhite", 532, 5), new bms("Copyright", 33432, 2), new bms("ExifIFDPointer", 34665, 4), new bms("GPSInfoIFDPointer", 34853, 4), new bms("DNGVersion", 50706, 1), new bms("DefaultCropSize", 50720, 3, 4)};
        X = bmsVarArr5;
        Y = new bms("StripOffsets", 273, 3);
        bms[] bmsVarArr6 = {new bms("ThumbnailImage", SemanticState.Hidden, 7), new bms("CameraSettingsIFDPointer", 8224, 4), new bms("ImageProcessingIFDPointer", 8256, 4)};
        Z = bmsVarArr6;
        bms[] bmsVarArr7 = {new bms("PreviewImageStart", 257, 4), new bms("PreviewImageLength", 258, 4)};
        aa = bmsVarArr7;
        bms[] bmsVarArr8 = {new bms("AspectFrame", 4371, 3)};
        ab = bmsVarArr8;
        bms[] bmsVarArr9 = {new bms("ColorSpace", 55, 3)};
        ac = bmsVarArr9;
        i = new bms[][]{bmsVarArr, bmsVarArr2, bmsVarArr3, bmsVarArr4, bmsVarArr5, bmsVarArr, bmsVarArr6, bmsVarArr7, bmsVarArr8, bmsVarArr9};
        ad = new bms[]{new bms("SubIFDPointer", 330, 4), new bms("ExifIFDPointer", 34665, 4), new bms("GPSInfoIFDPointer", 34853, 4), new bms("InteroperabilityIFDPointer", 40965, 4), new bms("CameraSettingsIFDPointer", 8224, 1), new bms("ImageProcessingIFDPointer", 8256, 1)};
        ae = new HashMap[10];
        j = new HashMap[10];
        k = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        af = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        l = charsetForName;
        m = "Exif\u0000\u0000".getBytes(charsetForName);
        n = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        R = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        S = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            bms[][] bmsVarArr10 = i;
            int length = bmsVarArr10.length;
            if (i2 >= 10) {
                bms[] bmsVarArr11 = ad;
                Integer numValueOf = Integer.valueOf(bmsVarArr11[0].a);
                HashMap map = af;
                map.put(numValueOf, 5);
                map.put(Integer.valueOf(bmsVarArr11[1].a), 1);
                map.put(Integer.valueOf(bmsVarArr11[2].a), 2);
                map.put(Integer.valueOf(bmsVarArr11[3].a), 3);
                map.put(Integer.valueOf(bmsVarArr11[4].a), 7);
                map.put(Integer.valueOf(bmsVarArr11[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            ae[i2] = new HashMap();
            j[i2] = new HashMap();
            for (bms bmsVar : bmsVarArr10[i2]) {
                ae[i2].put(Integer.valueOf(bmsVar.a), bmsVar);
                j[i2].put(bmsVar.b, bmsVar);
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    public bmu(InputStream inputStream) throws Throwable {
        int length = i.length;
        this.r = new HashMap[10];
        this.ah = new HashSet(10);
        this.s = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        FileDescriptor fd = null;
        this.o = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.ag = (AssetManager.AssetInputStream) inputStream;
            this.p = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (z(fileInputStream.getFD())) {
                    this.ag = null;
                    fd = fileInputStream.getFD();
                } else {
                    this.ag = null;
                }
            } else {
                this.ag = null;
            }
            this.p = fd;
        }
        q(inputStream);
    }

    private final boolean A(HashMap map) throws Throwable {
        bmr bmrVar = (bmr) map.get("ImageLength");
        bmr bmrVar2 = (bmr) map.get("ImageWidth");
        if (bmrVar != null && bmrVar2 != null) {
            int iA = bmrVar.a(this.s);
            int iA2 = bmrVar2.a(this.s);
            if (iA <= 512 && iA2 <= 512) {
                return true;
            }
        }
        return false;
    }

    private final void B(bmp bmpVar) throws Throwable {
        r(bmpVar);
        C(bmpVar, 0);
        D(bmpVar, 0);
        D(bmpVar, 5);
        D(bmpVar, 4);
        y();
        if (this.q == 8) {
            HashMap[] mapArr = this.r;
            bmr bmrVar = (bmr) mapArr[1].get("MakerNote");
            if (bmrVar != null) {
                bmp bmpVar2 = new bmp(bmrVar.d, (byte[]) null);
                bmpVar2.c = this.s;
                bmpVar2.b(6);
                C(bmpVar2, 9);
                bmr bmrVar2 = (bmr) mapArr[9].get("ColorSpace");
                if (bmrVar2 != null) {
                    mapArr[1].put("ColorSpace", bmrVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    private final void C(bmp bmpVar, int i2) throws IOException {
        int i3;
        long j2;
        boolean z;
        short s;
        int i4;
        int unsignedShort;
        long jA;
        int i5;
        Integer numValueOf = Integer.valueOf(bmpVar.b);
        Set set = this.ah;
        set.add(numValueOf);
        short s2 = bmpVar.readShort();
        if (s2 > 0) {
            short s3 = 0;
            while (s3 < s2) {
                int unsignedShort2 = bmpVar.readUnsignedShort();
                int unsignedShort3 = bmpVar.readUnsignedShort();
                int i6 = bmpVar.readInt();
                long j3 = bmpVar.b;
                HashMap map = ae[i2];
                Integer numValueOf2 = Integer.valueOf(unsignedShort2);
                bms bmsVar = (bms) map.get(numValueOf2);
                int i7 = 7;
                if (bmsVar == null) {
                    i3 = 4;
                    j2 = 0;
                    z = false;
                    s = s3;
                } else {
                    if (unsignedShort3 > 0) {
                        int[] iArr = g;
                        int length = iArr.length;
                        if (unsignedShort3 >= 14) {
                            i3 = 4;
                            j2 = 0;
                            z = false;
                            s = s3;
                        } else {
                            int i8 = bmsVar.c;
                            if (i8 == 7 || unsignedShort3 == 7 || i8 == unsignedShort3) {
                                i3 = 4;
                            } else {
                                int i9 = bmsVar.d;
                                if (i9 != unsignedShort3) {
                                    if (i8 != 4) {
                                        if (i9 == 4) {
                                            i9 = 4;
                                            i3 = 4;
                                        } else {
                                            i3 = 4;
                                        }
                                        if ((i8 != 9 || i9 == 9) && unsignedShort3 == 8) {
                                        }
                                    } else {
                                        i3 = 4;
                                    }
                                    if (unsignedShort3 != 3) {
                                        if (i8 != 9) {
                                        }
                                    }
                                } else {
                                    i3 = 4;
                                }
                                i7 = 7;
                            }
                            if (unsignedShort3 == i7) {
                                unsignedShort3 = i8;
                            }
                            s = s3;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            z = j2 >= 0 && j2 <= 2147483647L;
                        }
                    } else {
                        i3 = 4;
                    }
                    s = s3;
                    j2 = 0;
                }
                long j4 = j3 + 4;
                if (z) {
                    if (j2 > 4) {
                        int i10 = bmpVar.readInt();
                        if (this.q == 7) {
                            String str = bmsVar.b;
                            if ("MakerNote".equals(str)) {
                                this.ak = i10;
                            } else if (i2 == 6) {
                                if ("ThumbnailImage".equals(str)) {
                                    this.al = i10;
                                    this.am = i6;
                                    bmr bmrVarI = bmr.i(6, this.s);
                                    bmr bmrVarE = bmr.e(this.al, this.s);
                                    bmr bmrVarE2 = bmr.e(this.am, this.s);
                                    HashMap[] mapArr = this.r;
                                    mapArr[i3].put("Compression", bmrVarI);
                                    mapArr[i3].put("JPEGInterchangeFormat", bmrVarE);
                                    mapArr[i3].put("JPEGInterchangeFormatLength", bmrVarE2);
                                }
                                i4 = 6;
                            }
                            i6 = i6;
                            bmsVar = bmsVar;
                            i4 = i2;
                        } else {
                            i6 = i6;
                            bmsVar = bmsVar;
                            i4 = i2;
                        }
                        bmpVar.c(i10);
                    } else {
                        i6 = i6;
                        bmsVar = bmsVar;
                        i4 = i2;
                    }
                    Integer num = (Integer) af.get(numValueOf2);
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i3) {
                                jA = bmpVar.a();
                            } else if (unsignedShort3 == 8) {
                                unsignedShort = bmpVar.readShort();
                            } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                unsignedShort = bmpVar.readInt();
                            } else {
                                jA = -1;
                            }
                            if (jA > 0 && (((i5 = bmpVar.d) == -1 || jA < i5) && !set.contains(Integer.valueOf((int) jA)))) {
                                bmpVar.c(jA);
                                C(bmpVar, num.intValue());
                            }
                            bmpVar.c(j4);
                        } else {
                            unsignedShort = bmpVar.readUnsignedShort();
                        }
                        jA = unsignedShort;
                        if (jA > 0) {
                            bmpVar.c(jA);
                            C(bmpVar, num.intValue());
                        }
                        bmpVar.c(j4);
                    } else {
                        int i11 = bmpVar.b + this.y;
                        byte[] bArr = new byte[(int) j2];
                        bmpVar.readFully(bArr);
                        bmr bmrVar = new bmr(unsignedShort3, i6, i11, bArr);
                        HashMap map2 = this.r[i4];
                        String str2 = bmsVar.b;
                        map2.put(str2, bmrVar);
                        if ("DNGVersion".equals(str2)) {
                            this.q = 3;
                        }
                        if ((("Make".equals(str2) || "Model".equals(str2)) && bmrVar.l(this.s).contains("PENTAX")) || ("Compression".equals(str2) && bmrVar.a(this.s) == 65535)) {
                            this.q = 8;
                        }
                        if (bmpVar.b != j4) {
                            bmpVar.c(j4);
                        }
                    }
                } else {
                    bmpVar.c(j4);
                    s2 = s2;
                    s = s;
                }
                s3 = (short) (s + 1);
                s2 = s2;
            }
            int i12 = bmpVar.readInt();
            long j5 = i12;
            if (j5 <= 0 || set.contains(Integer.valueOf(i12))) {
                return;
            }
            bmpVar.c(j5);
            HashMap[] mapArr2 = this.r;
            if (mapArr2[4].isEmpty()) {
                C(bmpVar, 4);
            } else if (mapArr2[5].isEmpty()) {
                C(bmpVar, 5);
            }
        }
    }

    private final void D(bmp bmpVar, int i2) throws Throwable {
        bmr bmrVarI;
        bmr bmrVarI2;
        HashMap[] mapArr = this.r;
        bmr bmrVar = (bmr) mapArr[i2].get("DefaultCropSize");
        bmr bmrVar2 = (bmr) mapArr[i2].get("SensorTopBorder");
        bmr bmrVar3 = (bmr) mapArr[i2].get("SensorLeftBorder");
        bmr bmrVar4 = (bmr) mapArr[i2].get("SensorBottomBorder");
        bmr bmrVar5 = (bmr) mapArr[i2].get("SensorRightBorder");
        if (bmrVar != null) {
            int i3 = bmrVar.a;
            ByteOrder byteOrder = this.s;
            if (i3 == 5) {
                bmt[] bmtVarArr = (bmt[]) bmrVar.k(byteOrder);
                if (bmtVarArr == null || bmtVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(bmtVarArr))));
                    return;
                } else {
                    bmrVarI = bmr.g(bmtVarArr[0], this.s);
                    bmrVarI2 = bmr.g(bmtVarArr[1], this.s);
                }
            } else {
                int[] iArr = (int[]) bmrVar.k(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    bmrVarI = bmr.i(iArr[0], this.s);
                    bmrVarI2 = bmr.i(iArr[1], this.s);
                }
            }
            mapArr[i2].put("ImageWidth", bmrVarI);
            mapArr[i2].put("ImageLength", bmrVarI2);
            return;
        }
        if (bmrVar2 != null && bmrVar3 != null && bmrVar4 != null && bmrVar5 != null) {
            int iA = bmrVar2.a(this.s);
            int iA2 = bmrVar4.a(this.s);
            int iA3 = bmrVar5.a(this.s);
            int iA4 = bmrVar3.a(this.s);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            bmr bmrVarI3 = bmr.i(iA2 - iA, this.s);
            bmr bmrVarI4 = bmr.i(iA3 - iA4, this.s);
            mapArr[i2].put("ImageLength", bmrVarI3);
            mapArr[i2].put("ImageWidth", bmrVarI4);
            return;
        }
        bmr bmrVar6 = (bmr) mapArr[i2].get("ImageLength");
        bmr bmrVar7 = (bmr) mapArr[i2].get("ImageWidth");
        if (bmrVar6 == null || bmrVar7 == null) {
            bmr bmrVar8 = (bmr) mapArr[i2].get("JPEGInterchangeFormat");
            bmr bmrVar9 = (bmr) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (bmrVar8 == null || bmrVar9 == null) {
                return;
            }
            int iA5 = bmrVar8.a(this.s);
            int iA6 = bmrVar9.a(this.s);
            bmpVar.c(iA5);
            byte[] bArr = new byte[iA6];
            bmpVar.readFully(bArr);
            l(new bmp(bArr), iA5, i2);
        }
    }

    private static final void E(bmp bmpVar, bmq bmqVar, byte[] bArr) throws IOException {
        int i2 = bmpVar.readInt();
        bmqVar.write(bArr);
        bmqVar.b(i2);
        if (i2 % 2 == 1) {
            i2++;
        }
        aja.h(bmpVar, bmqVar, i2);
    }

    private static final int F(byte[] bArr) throws Throwable {
        long j2;
        bmp bmpVar = null;
        try {
            bmp bmpVar2 = new bmp(bArr);
            try {
                long j3 = bmpVar2.readInt();
                byte[] bArr2 = new byte[4];
                bmpVar2.readFully(bArr2);
                if (Arrays.equals(bArr2, B)) {
                    if (j3 == 1) {
                        j3 = bmpVar2.readLong();
                        j2 = 16;
                        if (j3 >= 16) {
                        }
                    } else {
                        j2 = 8;
                    }
                    if (j3 > 5000) {
                        j3 = 5000;
                    }
                    long j4 = j3 - j2;
                    if (j4 >= 8) {
                        byte[] bArr3 = new byte[4];
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        for (long j5 = 0; j5 < (j4 >> 2); j5++) {
                            try {
                                bmpVar2.readFully(bArr3);
                                if (j5 != 1) {
                                    if (Arrays.equals(bArr3, C)) {
                                        z = true;
                                    } else if (Arrays.equals(bArr3, D)) {
                                        z2 = true;
                                    } else if (Arrays.equals(bArr3, E) || Arrays.equals(bArr3, F)) {
                                        z3 = true;
                                    }
                                    if (!z) {
                                        continue;
                                    } else {
                                        if (z2) {
                                            bmpVar2.close();
                                            return 12;
                                        }
                                        if (z3) {
                                            bmpVar2.close();
                                            return 15;
                                        }
                                    }
                                }
                            } catch (EOFException unused) {
                            }
                        }
                    }
                }
                bmpVar2.close();
                return 0;
            } catch (Exception unused2) {
                bmpVar = bmpVar2;
                if (bmpVar == null) {
                    return 0;
                }
                bmpVar.close();
                return 0;
            } catch (Throwable th) {
                th = th;
                bmpVar = bmpVar2;
                if (bmpVar != null) {
                    bmpVar.close();
                }
                throw th;
            }
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static final ByteOrder G(bmp bmpVar) throws IOException {
        short s = bmpVar.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(s))));
    }

    private static final void H(bmp bmpVar, bmq bmqVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bmpVar.readFully(bArr3);
            E(bmpVar, bmqVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static int a(int i2) {
        if (i2 != 4) {
            return (i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) ? 2 : 1;
        }
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012c A[Catch: NumberFormatException -> 0x0147, TryCatch #1 {NumberFormatException -> 0x0147, blocks: (B:50:0x0103, B:52:0x0113, B:54:0x011d, B:55:0x012c, B:57:0x0131, B:58:0x013d), top: B:66:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0131 A[Catch: NumberFormatException -> 0x0147, TryCatch #1 {NumberFormatException -> 0x0147, blocks: (B:50:0x0103, B:52:0x0113, B:54:0x011d, B:55:0x012c, B:57:0x0131, B:58:0x013d), top: B:66:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013d A[Catch: NumberFormatException -> 0x0147, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0147, blocks: (B:50:0x0103, B:52:0x0113, B:54:0x011d, B:55:0x012c, B:57:0x0131, B:58:0x013d), top: B:66:0x0103 }] */
    public static Pair c(String str) {
        Pair pair;
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairC = c(strArrSplit[0]);
            if (((Integer) pairC.first).intValue() == 2) {
                return pairC;
            }
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                Pair pairC2 = c(strArrSplit[i2]);
                int iIntValue = (((Integer) pairC2.first).equals(pairC.first) || ((Integer) pairC2.second).equals(pairC.first)) ? ((Integer) pairC.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairC.second).intValue() == -1 || !(((Integer) pairC2.first).equals(pairC.second) || ((Integer) pairC2.second).equals(pairC.second))) ? -1 : ((Integer) pairC.second).intValue();
                if (iIntValue == -1) {
                    if (iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    iIntValue = -1;
                }
                if (iIntValue == -1) {
                    pairC = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairC = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairC;
        }
        if (str.contains("/")) {
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j2 < 0 || j3 < 0) {
                        return new Pair(10, -1);
                    }
                    return (j2 > 2147483647L || j3 > 2147483647L) ? new Pair(5, -1) : new Pair(10, 5);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        }
        try {
            try {
                long j4 = Long.parseLong(str);
                Long lValueOf = Long.valueOf(j4);
                lValueOf.getClass();
                if (j4 >= 0) {
                    lValueOf.getClass();
                    if (j4 <= 65535) {
                        pair = new Pair(3, 4);
                    } else {
                        lValueOf.getClass();
                        if (j4 < 0) {
                            pair = new Pair(9, -1);
                        } else {
                            pair = new Pair(4, -1);
                        }
                    }
                } else {
                    lValueOf.getClass();
                    if (j4 < 0) {
                        pair = new Pair(9, -1);
                    } else {
                        pair = new Pair(4, -1);
                    }
                }
                return pair;
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        } catch (NumberFormatException unused3) {
            Double.parseDouble(str);
            return new Pair(12, -1);
        }
    }

    private final void k() throws Throwable {
        String strE = e("DateTimeOriginal");
        if (strE != null && e("DateTime") == null) {
            this.r[0].put("DateTime", bmr.d(strE));
        }
        if (e("ImageWidth") == null) {
            this.r[0].put("ImageWidth", bmr.f(new long[]{0}, this.s));
        }
        if (e("ImageLength") == null) {
            this.r[0].put("ImageLength", bmr.f(new long[]{0}, this.s));
        }
        if (e("Orientation") == null) {
            this.r[0].put("Orientation", bmr.f(new long[]{0}, this.s));
        }
        if (e("LightSource") == null) {
            this.r[1].put("LightSource", bmr.f(new long[]{0}, this.s));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private final void l(defpackage.bmp r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmu.l(bmp, int, int):void");
    }

    private final void m(bmp bmpVar) throws Throwable {
        byte[] bArr;
        int length;
        bmpVar.c = ByteOrder.BIG_ENDIAN;
        int i2 = bmpVar.b;
        int length2 = d.length;
        bmpVar.b(8);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                break;
            }
            try {
                int i3 = bmpVar.readInt();
                int i4 = bmpVar.readInt();
                int i5 = bmpVar.b;
                int i6 = i5 + i3;
                int i7 = i5 - i2;
                if (i7 == 16) {
                    if (i4 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    i7 = 16;
                }
                if (i4 == 1229278788) {
                    break;
                }
                if (i4 == 1700284774) {
                    if (z) {
                        continue;
                    } else {
                        this.y = i7;
                        byte[] bArr2 = new byte[i3];
                        bmpVar.readFully(bArr2);
                        int i8 = bmpVar.readInt();
                        CRC32 crc32 = new CRC32();
                        x(crc32, 1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != i8) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                        }
                        s(bArr2, 0);
                        y();
                        v(new bmp(bArr2));
                        z = true;
                    }
                } else if (i4 == 1767135348 && !z2 && i3 >= (length = (bArr = e).length)) {
                    byte[] bArr3 = new byte[length];
                    bmpVar.readFully(bArr3);
                    if (Arrays.equals(bArr3, bArr)) {
                        int i9 = bmpVar.b - i2;
                        int i10 = i3 - length;
                        byte[] bArr4 = new byte[i10];
                        bmpVar.readFully(bArr4);
                        this.z = new bmr(1, i10, i9, bArr4);
                        z2 = true;
                    }
                }
                bmpVar.b((i6 + 4) - bmpVar.b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
        this.A = z2;
    }

    private final void n(bmp bmpVar) throws Throwable {
        bmpVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = I.length;
        bmpVar.b(4);
        int i2 = bmpVar.readInt() + 8;
        int length2 = J.length;
        bmpVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                bmpVar.readFully(bArr);
                int i4 = bmpVar.readInt();
                int i5 = i3 + 8;
                if (Arrays.equals(K, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    bmpVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = m;
                    if (aja.i(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.y = i5;
                    s(bArrCopyOfRange, 0);
                    v(new bmp(bArrCopyOfRange));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                i3 = i5 + i4;
                if (i3 == i2) {
                    return;
                }
                if (i3 > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bmpVar.b(i4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void o(bmp bmpVar, HashMap map) throws Throwable {
        bmr bmrVar = (bmr) map.get("JPEGInterchangeFormat");
        bmr bmrVar2 = (bmr) map.get("JPEGInterchangeFormatLength");
        if (bmrVar == null || bmrVar2 == null) {
            return;
        }
        int iA = bmrVar.a(this.s);
        int iA2 = bmrVar2.a(this.s);
        if (this.q == 7) {
            iA += this.ak;
        }
        if (iA <= 0 || iA2 <= 0) {
            return;
        }
        this.t = true;
        if (this.o == null && this.ag == null && this.p == null) {
            byte[] bArr = new byte[iA2];
            bmpVar.b(iA);
            bmpVar.readFully(bArr);
            this.w = bArr;
        }
        this.ai = iA;
        this.aj = iA2;
    }

    private final void p(bmp bmpVar, HashMap map) throws IOException {
        int length;
        int length2;
        int i2;
        bmr bmrVar = (bmr) map.get("StripOffsets");
        bmr bmrVar2 = (bmr) map.get("StripByteCounts");
        if (bmrVar == null || bmrVar2 == null) {
            return;
        }
        long[] jArrJ = aja.j(bmrVar.k(this.s));
        long[] jArrJ2 = aja.j(bmrVar2.k(this.s));
        if (jArrJ == null || (length = jArrJ.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrJ2 == null || (length2 = jArrJ2.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrJ2) {
            j2 += j3;
        }
        int i3 = (int) j2;
        byte[] bArr = new byte[i3];
        this.v = true;
        this.u = true;
        this.t = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int length3 = jArrJ.length;
            if (i4 >= length3) {
                int i7 = i3;
                this.w = bArr;
                if (this.v) {
                    this.ai = (int) jArrJ[0];
                    this.aj = i7;
                    return;
                }
                return;
            }
            int i8 = (int) jArrJ[i4];
            int i9 = (int) jArrJ2[i4];
            if (i4 < length3 - 1) {
                i2 = i3;
                if (i8 + i9 != jArrJ[i4 + 1]) {
                    this.v = false;
                }
            } else {
                i2 = i3;
            }
            int i10 = i8 - i5;
            if (i10 < 0) {
                return;
            }
            try {
                bmpVar.b(i10);
                int i11 = i5 + i10;
                byte[] bArr2 = new byte[i9];
                bmpVar.readFully(bArr2);
                i4++;
                i5 = i11 + i9;
                System.arraycopy(bArr2, 0, bArr, i6, i9);
                i6 += i9;
                i3 = i2;
            } catch (EOFException unused) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r3v33 */
    private final void q(InputStream inputStream) throws Throwable {
        String strExtractMetadata;
        int i2;
        int i3;
        int iF;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i4;
        int i5;
        int i6;
        bmp bmpVar;
        bmp bmpVar2;
        int i7 = 0;
        while (true) {
            try {
                try {
                    int length = i.length;
                    if (i7 >= 10) {
                        break;
                    }
                    this.r[i7] = new HashMap();
                    i7++;
                } catch (Throwable th) {
                    k();
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException unused) {
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr2 = c;
            int length2 = bArr2.length;
            strExtractMetadata = null;
            bmp bmpVar3 = null;
            bmp bmpVar4 = null;
            if (i8 >= 3) {
                i2 = 3;
                i3 = 1;
                iF = 4;
                break;
            }
            i2 = 3;
            if (bArr[i8] != bArr2[i8]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                int i9 = 0;
                while (true) {
                    if (i9 >= bytes.length) {
                        i3 = 1;
                        iF = 9;
                        break;
                    }
                    i3 = 1;
                    if (bArr[i9] != bytes[i9]) {
                        iF = F(bArr);
                        if (iF != 0) {
                            break;
                        }
                        try {
                            bmpVar = new bmp(bArr);
                            try {
                                ByteOrder byteOrderG = G(bmpVar);
                                this.s = byteOrderG;
                                bmpVar.c = byteOrderG;
                                short s = bmpVar.readShort();
                                boolean z = s == 20306 || s == 21330;
                                bmpVar.close();
                                if (z) {
                                    iF = 7;
                                    break;
                                }
                                try {
                                    bmpVar2 = new bmp(bArr);
                                    try {
                                        ByteOrder byteOrderG2 = G(bmpVar2);
                                        this.s = byteOrderG2;
                                        bmpVar2.c = byteOrderG2;
                                        short s2 = bmpVar2.readShort();
                                        bmpVar2.close();
                                        if (s2 == 85) {
                                            iF = 10;
                                            break;
                                        }
                                        int i10 = 0;
                                        while (true) {
                                            byte[] bArr3 = d;
                                            int length3 = bArr3.length;
                                            if (i10 >= 8) {
                                                iF = 13;
                                                break;
                                            }
                                            if (bArr[i10] != bArr3[i10]) {
                                                int i11 = 0;
                                                while (true) {
                                                    byte[] bArr4 = I;
                                                    int length4 = bArr4.length;
                                                    if (i11 >= 4) {
                                                        int i12 = 0;
                                                        while (true) {
                                                            byte[] bArr5 = J;
                                                            int length5 = bArr5.length;
                                                            if (i12 >= 4) {
                                                                iF = 14;
                                                                break;
                                                            } else {
                                                                int length6 = bArr4.length;
                                                                if (bArr[i12 + 8] == bArr5[i12]) {
                                                                    i12++;
                                                                }
                                                            }
                                                        }
                                                    } else if (bArr[i11] == bArr4[i11]) {
                                                        i11++;
                                                    }
                                                    iF = 0;
                                                    break;
                                                }
                                            }
                                            i10++;
                                        }
                                    } catch (Exception unused2) {
                                        if (bmpVar2 != null) {
                                            bmpVar2.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bmpVar3 = bmpVar2;
                                        if (bmpVar3 != null) {
                                            bmpVar3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    bmpVar2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Exception unused4) {
                                if (bmpVar != null) {
                                    bmpVar.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bmpVar4 = bmpVar;
                                if (bmpVar4 != null) {
                                    bmpVar4.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                            bmpVar = null;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        i9++;
                    }
                }
            } else {
                i8++;
            }
        }
        this.q = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            bmp bmpVar5 = new bmp(bufferedInputStream);
            int i13 = this.q;
            if (i13 == 4) {
                l(bmpVar5, 0, 0);
            } else if (i13 == 13) {
                m(bmpVar5);
            } else if (i13 == 9) {
                bmpVar5.b(84);
                byte[] bArr6 = new byte[4];
                byte[] bArr7 = new byte[4];
                byte[] bArr8 = new byte[4];
                bmpVar5.readFully(bArr6);
                bmpVar5.readFully(bArr7);
                bmpVar5.readFully(bArr8);
                int i14 = ByteBuffer.wrap(bArr6).getInt();
                int i15 = ByteBuffer.wrap(bArr7).getInt();
                int i16 = ByteBuffer.wrap(bArr8).getInt();
                byte[] bArr9 = new byte[i15];
                bmpVar5.b(i14 - bmpVar5.b);
                bmpVar5.readFully(bArr9);
                l(new bmp(bArr9), i14, 5);
                bmpVar5.b(i16 - bmpVar5.b);
                bmpVar5.c = ByteOrder.BIG_ENDIAN;
                int i17 = bmpVar5.readInt();
                for (int i18 = 0; i18 < i17; i18++) {
                    int unsignedShort = bmpVar5.readUnsignedShort();
                    int unsignedShort2 = bmpVar5.readUnsignedShort();
                    if (unsignedShort == Y.a) {
                        short s3 = bmpVar5.readShort();
                        short s4 = bmpVar5.readShort();
                        bmr bmrVarI = bmr.i(s3, this.s);
                        bmr bmrVarI2 = bmr.i(s4, this.s);
                        HashMap[] mapArr = this.r;
                        mapArr[0].put("ImageLength", bmrVarI);
                        mapArr[0].put("ImageWidth", bmrVarI2);
                        break;
                    }
                    bmpVar5.b(unsignedShort2);
                }
            } else if (i13 == 14) {
                n(bmpVar5);
            }
        } else {
            bmp bmpVar6 = new bmp(bufferedInputStream, (byte[]) null);
            int i19 = this.q;
            if (i19 == 12 || i19 == 15) {
                int i20 = 8;
                ?? mediaMetadataRetriever = 28;
                if (Build.VERSION.SDK_INT < 28) {
                    throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
                }
                if (i19 == 15 && (i4 = Build.VERSION.SDK_INT) < 31) {
                    mediaMetadataRetriever = i4;
                    throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
                }
                try {
                    mediaMetadataRetriever = i4;
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(new bmo(bmpVar6));
                        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                        String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                        String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                        String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                        if ("yes".equals(strExtractMetadata6)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(30);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                            strExtractMetadata2 = strExtractMetadata8;
                        } else if ("yes".equals(strExtractMetadata7)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                            strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        } else {
                            strExtractMetadata2 = null;
                            strExtractMetadata3 = null;
                        }
                        if (strExtractMetadata != null) {
                            this.r[0].put("ImageWidth", bmr.i(Integer.parseInt(strExtractMetadata), this.s));
                        }
                        if (strExtractMetadata2 != null) {
                            this.r[0].put("ImageLength", bmr.i(Integer.parseInt(strExtractMetadata2), this.s));
                        }
                        if (strExtractMetadata3 != null) {
                            int i21 = Integer.parseInt(strExtractMetadata3);
                            if (i21 == 90) {
                                i20 = 6;
                            } else if (i21 == 180) {
                                i20 = i2;
                            } else if (i21 != 270) {
                                i20 = i3;
                            }
                            this.r[0].put("Orientation", bmr.i(i20, this.s));
                        }
                        if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                            int i22 = Integer.parseInt(strExtractMetadata4);
                            int i23 = Integer.parseInt(strExtractMetadata5);
                            if (i23 <= 6) {
                                throw new IOException("Invalid exif length");
                            }
                            bmpVar6.c(i22);
                            byte[] bArr10 = new byte[6];
                            bmpVar6.readFully(bArr10);
                            int i24 = i22 + 6;
                            int i25 = i23 - 6;
                            if (!Arrays.equals(bArr10, m)) {
                                throw new IOException("Invalid identifier");
                            }
                            byte[] bArr11 = new byte[i25];
                            bmpVar6.readFully(bArr11);
                            this.y = i24;
                            s(bArr11, 0);
                        }
                        String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(41);
                        String strExtractMetadata10 = mediaMetadataRetriever.extractMetadata(42);
                        if (strExtractMetadata9 != null && strExtractMetadata10 != null) {
                            int i26 = Integer.parseInt(strExtractMetadata9);
                            int i27 = Integer.parseInt(strExtractMetadata10);
                            long j2 = i26;
                            bmpVar6.c(j2);
                            byte[] bArr12 = new byte[i27];
                            bmpVar6.readFully(bArr12);
                            this.z = new bmr(1, i27, j2, bArr12);
                            this.A = i3;
                        }
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException unused6) {
                        }
                    } catch (RuntimeException e2) {
                        throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e2);
                    }
                } catch (Throwable th6) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused7) {
                    }
                    throw th6;
                }
            } else if (i19 == 7) {
                B(bmpVar6);
                HashMap[] mapArr2 = this.r;
                bmr bmrVar = (bmr) mapArr2[i3].get("MakerNote");
                if (bmrVar != null) {
                    bmp bmpVar7 = new bmp(bmrVar.d, (byte[]) null);
                    bmpVar7.c = this.s;
                    byte[] bArr13 = G;
                    int length7 = bArr13.length;
                    byte[] bArr14 = new byte[6];
                    bmpVar7.readFully(bArr14);
                    bmpVar7.c(0L);
                    byte[] bArr15 = H;
                    int length8 = bArr15.length;
                    byte[] bArr16 = new byte[10];
                    bmpVar7.readFully(bArr16);
                    if (Arrays.equals(bArr14, bArr13)) {
                        bmpVar7.c(8L);
                    } else if (Arrays.equals(bArr16, bArr15)) {
                        bmpVar7.c(12L);
                    }
                    C(bmpVar7, 6);
                    bmr bmrVar2 = (bmr) mapArr2[7].get("PreviewImageStart");
                    bmr bmrVar3 = (bmr) mapArr2[7].get("PreviewImageLength");
                    if (bmrVar2 != null && bmrVar3 != null) {
                        mapArr2[5].put("JPEGInterchangeFormat", bmrVar2);
                        mapArr2[5].put("JPEGInterchangeFormatLength", bmrVar3);
                    }
                    bmr bmrVar4 = (bmr) mapArr2[8].get("AspectFrame");
                    if (bmrVar4 != null) {
                        int[] iArr = (int[]) bmrVar4.k(this.s);
                        if (iArr == null || iArr.length != 4) {
                            Log.w("ExifInterface", "Invalid aspect frame values. frame=".concat(String.valueOf(Arrays.toString(iArr))));
                        } else {
                            int i28 = iArr[2];
                            int i29 = iArr[0];
                            if (i28 > i29 && (i5 = iArr[i2]) > (i6 = iArr[i3])) {
                                int i30 = (i28 - i29) + 1;
                                int i31 = (i5 - i6) + 1;
                                if (i30 < i31) {
                                    int i32 = i30 + i31;
                                    i31 = i32 - i31;
                                    i30 = i32 - i31;
                                }
                                bmr bmrVarI3 = bmr.i(i30, this.s);
                                bmr bmrVarI4 = bmr.i(i31, this.s);
                                mapArr2[0].put("ImageWidth", bmrVarI3);
                                mapArr2[0].put("ImageLength", bmrVarI4);
                            }
                        }
                    }
                }
            } else if (i19 == 10) {
                B(bmpVar6);
                HashMap[] mapArr3 = this.r;
                bmr bmrVar5 = (bmr) mapArr3[0].get("JpgFromRaw");
                if (bmrVar5 != null) {
                    l(new bmp(bmrVar5.d), (int) bmrVar5.c, 5);
                }
                bmr bmrVar6 = (bmr) mapArr3[0].get("ISO");
                bmr bmrVar7 = (bmr) mapArr3[i3].get("PhotographicSensitivity");
                if (bmrVar6 != null && bmrVar7 == null) {
                    mapArr3[i3].put("PhotographicSensitivity", bmrVar6);
                }
            } else {
                B(bmpVar6);
            }
            bmpVar6.c(this.y);
            v(bmpVar6);
        }
        k();
    }

    private final void r(bmp bmpVar) throws IOException {
        ByteOrder byteOrderG = G(bmpVar);
        this.s = byteOrderG;
        bmpVar.c = byteOrderG;
        int unsignedShort = bmpVar.readUnsignedShort();
        int i2 = this.q;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int i3 = bmpVar.readInt();
        if (i3 < 8) {
            throw new IOException(a.bR(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            bmpVar.b(i4);
        }
    }

    private final void s(byte[] bArr, int i2) throws IOException {
        bmp bmpVar = new bmp(bArr, (byte[]) null);
        r(bmpVar);
        C(bmpVar, i2);
    }

    private final void t(String str) {
        int i2 = 0;
        while (true) {
            int length = i.length;
            if (i2 >= 10) {
                return;
            }
            this.r[i2].remove(str);
            i2++;
        }
    }

    private final void u(int i2, String str, String str2) {
        HashMap[] mapArr = this.r;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i2];
        map.put(str2, (bmr) map.get(str));
        mapArr[i2].remove(str);
    }

    private final void v(bmp bmpVar) throws Throwable {
        bmr bmrVar;
        HashMap map = this.r[4];
        bmr bmrVar2 = (bmr) map.get("Compression");
        if (bmrVar2 == null) {
            this.x = 6;
            o(bmpVar, map);
            return;
        }
        int iA = bmrVar2.a(this.s);
        this.x = iA;
        if (iA != 1) {
            if (iA == 6) {
                o(bmpVar, map);
                return;
            } else if (iA != 7) {
                return;
            }
        }
        bmr bmrVar3 = (bmr) map.get("BitsPerSample");
        if (bmrVar3 != null) {
            int[] iArr = (int[]) bmrVar3.k(this.s);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.q != 3 || (bmrVar = (bmr) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iA2 = bmrVar.a(this.s);
                if (iA2 == 1) {
                    if (!Arrays.equals(iArr, b)) {
                        return;
                    }
                } else if (iA2 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            p(bmpVar, map);
        }
    }

    private final void w(int i2, int i3) throws Throwable {
        HashMap[] mapArr = this.r;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            return;
        }
        bmr bmrVar = (bmr) mapArr[i2].get("ImageLength");
        bmr bmrVar2 = (bmr) mapArr[i2].get("ImageWidth");
        bmr bmrVar3 = (bmr) mapArr[i3].get("ImageLength");
        bmr bmrVar4 = (bmr) mapArr[i3].get("ImageWidth");
        if (bmrVar == null || bmrVar2 == null || bmrVar3 == null || bmrVar4 == null) {
            return;
        }
        int iA = bmrVar.a(this.s);
        int iA2 = bmrVar2.a(this.s);
        int iA3 = bmrVar3.a(this.s);
        int iA4 = bmrVar4.a(this.s);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private static void x(CRC32 crc32, int i2) {
        crc32.update(i2 >>> 24);
        crc32.update(i2 >>> 16);
        crc32.update(i2 >>> 8);
        crc32.update(i2);
    }

    private final void y() throws Throwable {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] mapArr = this.r;
        bmr bmrVar = (bmr) mapArr[1].get("PixelXDimension");
        bmr bmrVar2 = (bmr) mapArr[1].get("PixelYDimension");
        if (bmrVar != null && bmrVar2 != null) {
            mapArr[0].put("ImageWidth", bmrVar);
            mapArr[0].put("ImageLength", bmrVar2);
        }
        if (mapArr[4].isEmpty() && A(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        A(mapArr[4]);
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private static boolean z(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final int b(bmq bmqVar) throws IOException {
        HashMap[] mapArr;
        bms[][] bmsVarArr = i;
        int length = bmsVarArr.length;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        bms[] bmsVarArr2 = ad;
        int length2 = bmsVarArr2.length;
        for (int i2 = 0; i2 < 6; i2++) {
            t(bmsVarArr2[i2].b);
        }
        if (this.t) {
            if (this.u) {
                t("StripOffsets");
                t("StripByteCounts");
            } else {
                t("JPEGInterchangeFormat");
                t("JPEGInterchangeFormatLength");
            }
        }
        int i3 = 0;
        while (true) {
            int length3 = bmsVarArr.length;
            mapArr = this.r;
            if (i3 >= 10) {
                break;
            }
            Iterator it = mapArr[i3].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i3++;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(bmsVarArr2[1].b, bmr.e(0L, this.s));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(bmsVarArr2[2].b, bmr.e(0L, this.s));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(bmsVarArr2[3].b, bmr.e(0L, this.s));
        }
        int i4 = 4;
        if (this.t) {
            if (this.u) {
                mapArr[4].put("StripOffsets", bmr.i(0, this.s));
                mapArr[4].put("StripByteCounts", bmr.i(this.aj, this.s));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", bmr.e(0L, this.s));
                mapArr[4].put("JPEGInterchangeFormatLength", bmr.e(this.aj, this.s));
            }
        }
        int i5 = 0;
        while (true) {
            int length4 = bmsVarArr.length;
            if (i5 >= 10) {
                break;
            }
            Iterator it2 = mapArr[i5].entrySet().iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                int iB = ((bmr) ((Map.Entry) it2.next()).getValue()).b();
                if (iB > 4) {
                    i6 += iB;
                }
            }
            iArr2[i5] = iArr2[i5] + i6;
            i5++;
        }
        int size = 8;
        int i7 = 0;
        while (true) {
            int length5 = bmsVarArr.length;
            if (i7 >= 10) {
                break;
            }
            if (!mapArr[i7].isEmpty()) {
                iArr[i7] = size;
                size += (mapArr[i7].size() * 12) + 6 + iArr2[i7];
            }
            i7++;
        }
        if (this.t) {
            if (this.u) {
                mapArr[4].put("StripOffsets", bmr.i(size, this.s));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", bmr.e(size, this.s));
            }
            this.ai = size;
            size += this.aj;
        }
        if (this.q == 4) {
            size += 8;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(bmsVarArr2[1].b, bmr.e(iArr[1], this.s));
        }
        if (!mapArr[r3].isEmpty()) {
            mapArr[0].put(bmsVarArr2[r3].b, bmr.e(iArr[2], this.s));
        }
        if (!mapArr[r3].isEmpty()) {
            mapArr[1].put(bmsVarArr2[r3].b, bmr.e(iArr[3], this.s));
        }
        int i8 = this.q;
        if (i8 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(a.bP(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            bmqVar.e(size);
            bmqVar.write(m);
        } else if (i8 == 13) {
            bmqVar.b(size);
            bmqVar.b(1700284774);
        } else if (i8 == 14) {
            bmqVar.write(K);
            bmqVar.b(size);
        }
        int size2 = bmqVar.a.size();
        bmqVar.c(this.s == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bmqVar.b = this.s;
        bmqVar.e(42);
        bmqVar.d(8L);
        int i9 = 0;
        while (true) {
            int length6 = bmsVarArr.length;
            if (i9 >= 10) {
                break;
            }
            if (!mapArr[i9].isEmpty()) {
                bmqVar.e(mapArr[i9].size());
                int size3 = iArr[i9] + 2 + (mapArr[i9].size() * 12) + i4;
                for (Map.Entry entry : mapArr[i9].entrySet()) {
                    int i10 = ((bms) j[i9].get(entry.getKey())).a;
                    bmr bmrVar = (bmr) entry.getValue();
                    int iB2 = bmrVar.b();
                    bmqVar.e(i10);
                    bmqVar.e(bmrVar.a);
                    bmqVar.b(bmrVar.b);
                    if (iB2 > i4) {
                        bmqVar.d(size3);
                        size3 += iB2;
                    } else {
                        bmqVar.write(bmrVar.d);
                        if (iB2 < i4) {
                            while (iB2 < i4) {
                                bmqVar.a(0);
                                iB2++;
                            }
                        }
                    }
                }
                if (i9 != 0) {
                    bmqVar.d(0L);
                } else if (mapArr[i4].isEmpty()) {
                    i9 = 0;
                    bmqVar.d(0L);
                } else {
                    bmqVar.d(iArr[i4]);
                    i9 = 0;
                }
                Iterator it3 = mapArr[i9].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((bmr) ((Map.Entry) it3.next()).getValue()).d;
                    int length7 = bArr.length;
                    if (length7 > i4) {
                        bmqVar.write(bArr, 0, length7);
                        i4 = 4;
                    }
                }
            }
            i9++;
            i4 = 4;
        }
        if (this.t) {
            bmqVar.write(i());
        }
        if (this.q == 14 && size % 2 == 1) {
            bmqVar.a(0);
        }
        bmqVar.b = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final bmr d(String str) {
        bmr bmrVar;
        bmr bmrVar2;
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        if ("Xmp".equals(str) && a(this.q) == 2 && (bmrVar2 = this.z) != null) {
            return bmrVar2;
        }
        while (true) {
            int length = i.length;
            if (i2 >= 10) {
                if (!"Xmp".equals(str) || (bmrVar = this.z) == null) {
                    return null;
                }
                return bmrVar;
            }
            bmr bmrVar3 = (bmr) this.r[i2].get(str);
            if (bmrVar3 != null) {
                return bmrVar3;
            }
            i2++;
        }
    }

    public final String e(String str) throws Throwable {
        double d2;
        bmr bmrVarD = d(str);
        if (bmrVarD == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = bmrVarD.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", a.bR(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            bmt[] bmtVarArr = (bmt[]) bmrVarD.k(this.s);
            if (bmtVarArr == null || bmtVarArr.length != 3) {
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(bmtVarArr))));
                return null;
            }
            bmt bmtVar = bmtVarArr[0];
            Integer numValueOf = Integer.valueOf((int) (bmtVar.a / bmtVar.b));
            bmt bmtVar2 = bmtVarArr[1];
            Integer numValueOf2 = Integer.valueOf((int) (bmtVar2.a / bmtVar2.b));
            bmt bmtVar3 = bmtVarArr[2];
            return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (bmtVar3.a / bmtVar3.b)));
        }
        if (!k.contains(str)) {
            return bmrVarD.l(this.s);
        }
        try {
            Object objK = bmrVarD.k(this.s);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                d2 = Double.parseDouble((String) objK);
            } else if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                if (iArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(objK instanceof bmt[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                bmt[] bmtVarArr2 = (bmt[]) objK;
                if (bmtVarArr2.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                bmt bmtVar4 = bmtVarArr2[0];
                d2 = bmtVar4.a / bmtVar4.b;
            }
            return Double.toString(d2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01d6 A[Catch: all -> 0x01e9, Exception -> 0x01ec, TryCatch #5 {Exception -> 0x01ec, all -> 0x01e9, blocks: (B:4:0x002b, B:6:0x0038, B:8:0x0048, B:9:0x004a, B:65:0x01bb, B:67:0x01d6, B:68:0x01df, B:10:0x0052, B:12:0x0061, B:14:0x0069, B:16:0x006d, B:18:0x0085, B:19:0x008a, B:20:0x008c, B:22:0x0097, B:23:0x009b, B:24:0x00a0, B:26:0x00b0, B:28:0x00b8, B:32:0x00c9, B:34:0x00d1, B:37:0x00d8, B:39:0x00e7, B:41:0x00f9, B:55:0x014b, B:57:0x0157, B:58:0x015e, B:60:0x0198, B:64:0x01b4, B:61:0x01a4, B:63:0x01ac, B:42:0x010a, B:43:0x0111, B:44:0x0112, B:46:0x011e, B:48:0x0124, B:51:0x013a, B:52:0x013d, B:53:0x0144), top: B:87:0x002b }] */
    public final void f(InputStream inputStream, OutputStream outputStream) throws Throwable {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int iB;
        bmp bmpVar = new bmp(inputStream, ByteOrder.LITTLE_ENDIAN);
        bmq bmqVar = new bmq(outputStream, ByteOrder.LITTLE_ENDIAN);
        int length = I.length;
        aja.h(bmpVar, bmqVar, 4);
        int i6 = bmpVar.readInt();
        int length2 = J.length;
        bmpVar.b(4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bmq bmqVar2 = new bmq(byteArrayOutputStream2, ByteOrder.LITTLE_ENDIAN);
                    int i7 = this.y;
                    if (i7 == 0) {
                        byte[] bArr = new byte[4];
                        bmpVar.readFully(bArr);
                        byte[] bArr2 = M;
                        if (Arrays.equals(bArr, bArr2)) {
                            int i8 = bmpVar.readInt();
                            byte[] bArr3 = new byte[i8 % 2 == 1 ? i8 + 1 : i8];
                            bmpVar.readFully(bArr3);
                            byte b2 = (byte) (bArr3[0] | 8);
                            bArr3[0] = b2;
                            int i9 = (b2 >> 1) & 1;
                            bmqVar2.write(bArr2);
                            bmqVar2.b(i8);
                            bmqVar2.write(bArr3);
                            if (i9 != 0) {
                                H(bmpVar, bmqVar2, P, null);
                                while (true) {
                                    byte[] bArr4 = new byte[4];
                                    try {
                                        bmpVar.readFully(bArr4);
                                        if (!Arrays.equals(bArr4, Q)) {
                                            break;
                                        } else {
                                            E(bmpVar, bmqVar2, bArr4);
                                        }
                                    } catch (EOFException unused) {
                                    }
                                }
                                iB = b(bmqVar2);
                            } else {
                                H(bmpVar, bmqVar2, O, N);
                                iB = b(bmqVar2);
                            }
                        } else {
                            byte[] bArr5 = O;
                            if (Arrays.equals(bArr, bArr5) || Arrays.equals(bArr, N)) {
                                int i10 = bmpVar.readInt();
                                int i11 = i10 % 2 == 1 ? i10 + 1 : i10;
                                byte[] bArr6 = new byte[3];
                                boolean z = true;
                                if (Arrays.equals(bArr, bArr5)) {
                                    bmpVar.readFully(bArr6);
                                    byte[] bArr7 = new byte[3];
                                    bmpVar.readFully(bArr7);
                                    c2 = 0;
                                    if (!Arrays.equals(L, bArr7)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i3 = bmpVar.readInt();
                                    i5 = i3 & 16383;
                                    i2 = -1;
                                    i4 = (i3 >> 16) & 16383;
                                    i11 -= 10;
                                    z = false;
                                } else {
                                    c2 = 0;
                                    i2 = -1;
                                    if (!Arrays.equals(bArr, N)) {
                                        i3 = 0;
                                        i4 = 0;
                                        i5 = 0;
                                        z = false;
                                    } else {
                                        if (bmpVar.readByte() != 47) {
                                            throw new IOException("Error checking VP8L signature");
                                        }
                                        i3 = bmpVar.readInt();
                                        i5 = (i3 & 16383) + 1;
                                        i4 = ((i3 >>> 14) & 16383) + 1;
                                        if ((i3 & 268435456) == 0) {
                                            z = false;
                                        }
                                        i11 -= 5;
                                    }
                                }
                                bmqVar2.write(bArr2);
                                bmqVar2.b(10);
                                byte[] bArr8 = new byte[10];
                                if (z) {
                                    bArr8[c2] = (byte) (bArr8[c2] | 16);
                                }
                                bArr8[c2] = (byte) (bArr8[c2] | 8);
                                int i12 = i5 - 1;
                                int i13 = i4 - 1;
                                bArr8[4] = (byte) i12;
                                bArr8[5] = (byte) (i12 >> 8);
                                bArr8[6] = (byte) (i12 >> 16);
                                bArr8[7] = (byte) i13;
                                bArr8[8] = (byte) (i13 >> 8);
                                bArr8[9] = (byte) (i13 >> 16);
                                bmqVar2.write(bArr8);
                                bmqVar2.write(bArr);
                                bmqVar2.b(i10);
                                if (Arrays.equals(bArr, bArr5)) {
                                    bmqVar2.write(bArr6);
                                    bmqVar2.write(L);
                                    bmqVar2.b(i3);
                                } else if (Arrays.equals(bArr, N)) {
                                    bmqVar2.write(47);
                                    bmqVar2.b(i3);
                                }
                                aja.h(bmpVar, bmqVar2, i11);
                                iB = b(bmqVar2);
                            } else {
                                iB = -1;
                                i2 = -1;
                            }
                        }
                        aja.h(bmpVar, bmqVar2, (i6 + 8) - bmpVar.b);
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr9 = J;
                        int length3 = bArr9.length;
                        bmqVar.b(size + 4);
                        bmqVar.write(bArr9);
                        if (iB != i2) {
                            this.y = bmqVar.a.size() + iB;
                        }
                        byteArrayOutputStream2.writeTo(bmqVar);
                        aja.k(bmpVar, bmqVar);
                        hmy.f(byteArrayOutputStream2);
                    }
                    aja.h(bmpVar, bmqVar2, i7 - 20);
                    bmpVar.b(4);
                    int i14 = bmpVar.readInt();
                    if (i14 % 2 != 0) {
                        i14++;
                    }
                    bmpVar.b(i14);
                    iB = b(bmqVar2);
                    i2 = -1;
                    aja.h(bmpVar, bmqVar2, (i6 + 8) - bmpVar.b);
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr10 = J;
                    int length4 = bArr10.length;
                    bmqVar.b(size2 + 4);
                    bmqVar.write(bArr10);
                    if (iB != i2) {
                        this.y = bmqVar.a.size() + iB;
                    }
                    byteArrayOutputStream2.writeTo(bmqVar);
                    aja.k(bmpVar, bmqVar);
                    hmy.f(byteArrayOutputStream2);
                } catch (Exception e2) {
                    e = e2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    hmy.f(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void g(bmq bmqVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.y = bmqVar.a.size() + b(new bmq(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bmqVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        bmqVar.b((int) crc32.getValue());
    }

    public final void h(bmq bmqVar) throws IOException {
        bmqVar.b(this.z.d.length + 22);
        CRC32 crc32 = new CRC32();
        bmqVar.b(1767135348);
        x(crc32, 1767135348);
        byte[] bArr = e;
        bmqVar.write(bArr);
        crc32.update(bArr);
        bmqVar.write(this.z.d);
        crc32.update(this.z.d);
        bmqVar.b((int) crc32.getValue());
        this.A = true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    public final byte[] i() throws Throwable {
        FileDescriptor fileDescriptorDup;
        InputStream fileInputStream;
        FileDescriptor fileDescriptor;
        InputStream inputStream = null;
        if (this.t) {
            byte[] bArr = this.w;
            if (bArr != null) {
                return bArr;
            }
            try {
                fileInputStream = this.ag;
                if (fileInputStream != null) {
                    try {
                        if (fileInputStream.markSupported()) {
                            fileInputStream.reset();
                            fileDescriptor = null;
                            try {
                                bmp bmpVar = new bmp(fileInputStream);
                                bmpVar.b(this.ai + this.y);
                                byte[] bArr2 = new byte[this.aj];
                                bmpVar.readFully(bArr2);
                                this.w = bArr2;
                                hmy.f(fileInputStream);
                                if (fileDescriptor != null) {
                                    aja.g(fileDescriptor);
                                }
                                return bArr2;
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                th = th;
                                inputStream = fileInputStream;
                                fileDescriptorDup = fileDescriptor;
                                hmy.f(inputStream);
                                if (fileDescriptorDup != null) {
                                    aja.g(fileDescriptorDup);
                                }
                                throw th;
                            }
                        } else {
                            hmy.f(fileInputStream);
                        }
                    } catch (Exception unused2) {
                        fileDescriptor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = fileInputStream;
                        fileDescriptorDup = null;
                        hmy.f(inputStream);
                        if (fileDescriptorDup != null) {
                            aja.g(fileDescriptorDup);
                        }
                        throw th;
                    }
                    hmy.f(fileInputStream);
                    if (fileDescriptor != null) {
                        aja.g(fileDescriptor);
                    }
                } else {
                    String str = this.o;
                    if (str != null) {
                        fileInputStream = new FileInputStream(str);
                        fileDescriptor = null;
                        bmp bmpVar2 = new bmp(fileInputStream);
                        bmpVar2.b(this.ai + this.y);
                        byte[] bArr3 = new byte[this.aj];
                        bmpVar2.readFully(bArr3);
                        this.w = bArr3;
                        hmy.f(fileInputStream);
                        if (fileDescriptor != null) {
                            aja.g(fileDescriptor);
                        }
                        return bArr3;
                    }
                    fileDescriptorDup = Os.dup(this.p);
                    try {
                        Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = new FileInputStream(fileDescriptorDup);
                        bmp bmpVar3 = new bmp(fileInputStream);
                        bmpVar3.b(this.ai + this.y);
                        byte[] bArr4 = new byte[this.aj];
                        bmpVar3.readFully(bArr4);
                        this.w = bArr4;
                        hmy.f(fileInputStream);
                        if (fileDescriptor != null) {
                            aja.g(fileDescriptor);
                        }
                        return bArr4;
                    } catch (Exception unused3) {
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        hmy.f(inputStream);
                        if (fileDescriptorDup != null) {
                            aja.g(fileDescriptorDup);
                        }
                        throw th;
                    }
                }
            } catch (Exception unused4) {
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th4) {
                th = th4;
                fileDescriptorDup = null;
            }
        }
        return null;
    }

    public final int j() {
        bmr bmrVarD = d("Orientation");
        if (bmrVarD == null) {
            return 1;
        }
        try {
            return bmrVarD.a(this.s);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public bmu(String str) throws Throwable {
        int length = i.length;
        this.r = new HashMap[10];
        this.ah = new HashSet(10);
        this.s = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.ag = null;
            this.o = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (z(fileInputStream2.getFD())) {
                        this.p = fileInputStream2.getFD();
                    } else {
                        this.p = null;
                    }
                    q(fileInputStream2);
                    hmy.f(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    hmy.f(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }
}
