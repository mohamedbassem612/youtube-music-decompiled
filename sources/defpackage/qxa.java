package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import j$.util.Optional;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxa implements AutoCloseable {
    private FileInputStream a;
    private final qxf b = new qxf();

    /* JADX WARN: Code duplicated, block: B:224:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:225:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:232:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:234:0x03db  */
    /* JADX WARN: Code duplicated, block: B:248:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:252:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:253:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:255:0x0401 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x0403 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:257:0x0405 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x0407  */
    /* JADX WARN: Code duplicated, block: B:259:0x040e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0410  */
    /* JADX WARN: Code duplicated, block: B:261:0x0417  */
    /* JADX WARN: Code duplicated, block: B:262:0x041e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0442  */
    /* JADX WARN: Code duplicated, block: B:269:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x0486  */
    /* JADX WARN: Code duplicated, block: B:280:0x04a3 A[LOOP:1: B:274:0x046c->B:280:0x04a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:290:0x0478 A[SYNTHETIC] */
    public final agke a() {
        String string;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        bru bruVar;
        int iF;
        int iF2;
        int iF3;
        agjz agjzVar;
        int i15;
        ByteBuffer byteBuffer;
        int i16;
        int i17;
        agjz agjzVar2 = new agjz(4);
        int i18 = 0;
        while (true) {
            MediaExtractor mediaExtractor = this.b.a;
            if (i18 >= mediaExtractor.getTrackCount()) {
                return agjzVar2.g();
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i18);
            String string2 = trackFormat.getString("mime");
            Optional optionalC = qxc.c(trackFormat, "sample-rate");
            Optional optionalC2 = qxc.c(trackFormat, "channel-count");
            Optional optionalOf = trackFormat.containsKey("durationUs") ? Optional.of(Long.valueOf(trackFormat.getLong("durationUs"))) : Optional.empty();
            if (true == optionalOf.isPresent()) {
                optionalOf = Optional.ofNullable(ahbt.b(((Long) optionalOf.get()).longValue()));
            }
            Optional optional = optionalOf;
            Optional optionalC3 = qxc.c(trackFormat, "width");
            Optional optionalC4 = qxc.c(trackFormat, "height");
            Integer num = (Integer) qxc.c(trackFormat, "rotation-degrees").orElse(0);
            Optional optionalC5 = qxc.c(trackFormat, "color-standard");
            Optional optionalC6 = qxc.c(trackFormat, "color-transfer");
            Optional optionalC7 = qxc.c(trackFormat, "color-range");
            boolean z2 = num.intValue() == 90 || num.intValue() == 270;
            if (string2 != null) {
                Optional optional2 = true != z2 ? optionalC3 : optionalC4;
                if (true != z2) {
                    optionalC3 = optionalC4;
                }
                bsd bsdVar = new bsd();
                bsdVar.e(trackFormat.getString("mime"));
                bsdVar.d = trackFormat.getString("language");
                bsdVar.j = atv.f(trackFormat, "max-bitrate", -1);
                bsdVar.i = atv.f(trackFormat, "bitrate", -1);
                if (Objects.equals(trackFormat.getString("mime"), "video/3gpp") && trackFormat.containsKey("profile") && trackFormat.containsKey("level")) {
                    int integer = trackFormat.getInteger("profile");
                    byte[] bArr2 = bvf.a;
                    if (integer == 1) {
                        i16 = 0;
                    } else if (integer == 2) {
                        i16 = 1;
                    } else if (integer == 4) {
                        i16 = 2;
                    } else if (integer == 8) {
                        i16 = 3;
                    } else if (integer == 16) {
                        i16 = 4;
                    } else if (integer == 32) {
                        i16 = 5;
                    } else if (integer == 64) {
                        i16 = 6;
                    } else if (integer != 128) {
                        i16 = integer != 256 ? -1 : 8;
                    } else {
                        i16 = 7;
                    }
                    int integer2 = trackFormat.getInteger("level");
                    if (integer2 == 1) {
                        i17 = 10;
                    } else if (integer2 == 2) {
                        i17 = 20;
                    } else if (integer2 == 4) {
                        i17 = 30;
                    } else if (integer2 == 8) {
                        i17 = 40;
                    } else if (integer2 == 16) {
                        i17 = 45;
                    } else if (integer2 == 32) {
                        i17 = 50;
                    } else if (integer2 != 64) {
                        i17 = integer2 != 128 ? -1 : 70;
                    } else {
                        i17 = 60;
                    }
                    string = bwp.K("s263.%d.%d", Integer.valueOf(i16), Integer.valueOf(i17));
                } else if (Objects.equals(trackFormat.getString("mime"), "video/dolby-vision") && trackFormat.containsKey("profile")) {
                    int iF4 = atv.f(trackFormat, "level", -1);
                    if (iF4 == -1) {
                        int iF5 = atv.f(trackFormat, "width", -1);
                        int iF6 = atv.f(trackFormat, "height", -1);
                        float fJ = atv.j(trackFormat);
                        byte[] bArr3 = bvf.a;
                        int iMax = Math.max(iF5, iF6);
                        ahno.O(iMax <= 7680);
                        float f = iF5 * iF6 * fJ;
                        if (iMax <= 1280) {
                            iF4 = f <= 2.21184E7f ? 1 : 2;
                        } else if (iMax <= 1920 && f <= 4.97664E7f) {
                            iF4 = 4;
                        } else if (iMax <= 2560 && f <= 6.2208E7f) {
                            iF4 = 8;
                        } else if (iMax <= 3840) {
                            if (f <= 1.24416E8f) {
                                iF4 = 16;
                            } else if (f <= 1.990656E8f) {
                                iF4 = 32;
                            } else if (f <= 2.48832E8f) {
                                iF4 = 64;
                            } else if (f <= 3.981312E8f) {
                                iF4 = SemanticState.Focused;
                            } else {
                                iF4 = f <= 4.97664E8f ? SemanticState.Hidden : SemanticState.LiveRegion;
                            }
                        } else if (iMax <= 7680) {
                            iF4 = f <= 9.95328E8f ? SemanticState.ReadOnly : SemanticState.Modal;
                        } else {
                            iF4 = -1;
                        }
                    }
                    int integer3 = trackFormat.getInteger("profile");
                    byte[] bArr4 = bvf.a;
                    int i19 = 1;
                    if (integer3 != 1) {
                        if (integer3 == 2) {
                            i = 1;
                        } else if (integer3 == 4) {
                            i = 2;
                        } else if (integer3 == 8) {
                            i = 3;
                        } else if (integer3 == 16) {
                            i = 4;
                        } else if (integer3 == 32) {
                            i = 5;
                        } else if (integer3 == 64) {
                            i = 6;
                        } else if (integer3 == 128) {
                            i = 7;
                        } else if (integer3 == 256) {
                            i = 8;
                        } else if (integer3 == 512) {
                            i = 9;
                        } else {
                            if (integer3 != 1024) {
                                throw new IllegalArgumentException("Unknown Dolby Vision profile: " + integer3);
                            }
                            i = 10;
                        }
                        i19 = 1;
                    } else {
                        i = 0;
                    }
                    if (iF4 == i19) {
                        i2 = 1;
                    } else if (iF4 != 2) {
                        switch (iF4) {
                            case 4:
                                i2 = 3;
                                break;
                            case 8:
                                i2 = 4;
                                break;
                            case 16:
                                i2 = 5;
                                break;
                            case 32:
                                i2 = 6;
                                break;
                            case 64:
                                i2 = 7;
                                break;
                            case SemanticState.Focused /* 128 */:
                                i2 = 8;
                                break;
                            case SemanticState.Hidden /* 256 */:
                                i2 = 9;
                                break;
                            case SemanticState.LiveRegion /* 512 */:
                                i2 = 10;
                                break;
                            case SemanticState.ReadOnly /* 1024 */:
                                i2 = 11;
                                break;
                            case SemanticState.Modal /* 2048 */:
                                i2 = 12;
                                break;
                            case SemanticState.Obscured /* 4096 */:
                                i2 = 13;
                                break;
                            default:
                                throw new IllegalArgumentException(a.bR(iF4, "Unknown Dolby Vision level: "));
                        }
                    } else {
                        i2 = 2;
                    }
                    if (i > 9) {
                        string = bwp.K("dvh1.%02d.%02d", 10, Integer.valueOf(i2));
                    } else {
                        string = i > 8 ? bwp.K("dvav.%02d.%02d", 9, Integer.valueOf(i2)) : bwp.K("dvhe.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2));
                    }
                } else {
                    string = trackFormat.getString("codecs-string");
                }
                bsdVar.k = string;
                float fJ2 = atv.j(trackFormat);
                if (fJ2 <= 0.0f || Float.isNaN(fJ2)) {
                    fJ2 = -1.0f;
                }
                bsdVar.b(fJ2);
                bsdVar.u = atv.f(trackFormat, "width", -1);
                bsdVar.v = atv.f(trackFormat, "height", -1);
                bsdVar.B = (trackFormat.containsKey("sar-width") && trackFormat.containsKey("sar-height")) ? trackFormat.getInteger("sar-width") / trackFormat.getInteger("sar-height") : 1.0f;
                bsdVar.p = atv.f(trackFormat, "max-input-size", -1);
                bsdVar.z = atv.f(trackFormat, "rotation-degrees", 0);
                int iF7 = atv.f(trackFormat, "color-standard", -1);
                int iF8 = atv.f(trackFormat, "color-range", -1);
                int iF9 = atv.f(trackFormat, "color-transfer", -1);
                ByteBuffer byteBuffer2 = trackFormat.getByteBuffer("hdr-static-info");
                if (byteBuffer2 != null) {
                    bArr = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr);
                } else {
                    bArr = null;
                }
                byte[] bArr5 = bArr;
                if (iF7 != 2) {
                    i3 = 1;
                    if (iF7 != 1 && iF7 != 6) {
                        i4 = -1;
                        if (iF7 == -1) {
                            i6 = 1;
                            i5 = -1;
                        } else {
                            i5 = iF7;
                            i6 = 0;
                        }
                    }
                    if (i3 != i6) {
                        i7 = i4;
                    } else {
                        i7 = i5;
                    }
                    if (iF8 != 2 || iF8 == i3) {
                        i8 = i3;
                    } else if (iF8 == i4) {
                        i8 = i3;
                        iF8 = -1;
                    } else {
                        i8 = 0;
                    }
                    if (i3 != i8) {
                        iF8 = -1;
                    }
                    if (iF9 != i3 || iF9 == 3 || iF9 == 2 || iF9 == 6 || iF9 == 7) {
                        i9 = -1;
                        i10 = iF9;
                    } else {
                        i9 = -1;
                        if (iF9 == -1) {
                            i10 = -1;
                        } else {
                            i10 = iF9;
                            z = false;
                        }
                        if (true != z) {
                            i11 = i9;
                        } else {
                            i11 = i10;
                        }
                        if (i7 != i9) {
                            i12 = i7;
                            i13 = i11;
                            i14 = iF8;
                        } else if (iF8 != i9) {
                            i13 = i11;
                            i14 = iF8;
                            i12 = -1;
                        } else if (i11 == i9) {
                            if (bArr5 != null) {
                                i12 = -1;
                                i14 = -1;
                                i13 = -1;
                            } else {
                                bruVar = null;
                            }
                            bsdVar.E = bruVar;
                            bsdVar.I = atv.f(trackFormat, "sample-rate", -1);
                            iF = atv.f(trackFormat, "exo-pcm-encoding-int", -1);
                            if (iF == -1) {
                                iF = atv.f(trackFormat, "pcm-encoding", -1);
                            }
                            bsdVar.J = iF;
                            iF2 = atv.f(trackFormat, "channel-count", -1);
                            iF3 = atv.f(trackFormat, "channel-mask", -1);
                            if (iF2 != -1 && iF3 != -1 && Integer.bitCount(iF3) != iF2) {
                                iF3 = -1;
                            }
                            bsdVar.G = iF2;
                            bsdVar.H = iF3;
                            agjzVar = new agjz(4);
                            i15 = 0;
                            while (true) {
                                byteBuffer = trackFormat.getByteBuffer(a.bR(i15, "csd-"));
                                if (byteBuffer == null) {
                                    bsdVar.r = agjzVar.g();
                                    if (trackFormat.containsKey("track-id")) {
                                        bsdVar.c(trackFormat.getInteger("track-id"));
                                    }
                                    agjzVar2.h(new qwz(string2, optionalC2, optionalC, optional, optional2, optionalC3, optionalC5, optionalC6, optionalC7, new bse(bsdVar)));
                                } else {
                                    byte[] bArr6 = new byte[byteBuffer.remaining()];
                                    byteBuffer.get(bArr6);
                                    byteBuffer.rewind();
                                    agjzVar.h(bArr6);
                                    i15++;
                                }
                            }
                        } else {
                            i13 = i11;
                            i12 = -1;
                            i14 = -1;
                        }
                        bruVar = new bru(i12, i14, i13, bArr5, -1, -1);
                        bsdVar.E = bruVar;
                        bsdVar.I = atv.f(trackFormat, "sample-rate", -1);
                        iF = atv.f(trackFormat, "exo-pcm-encoding-int", -1);
                        if (iF == -1) {
                            iF = atv.f(trackFormat, "pcm-encoding", -1);
                        }
                        bsdVar.J = iF;
                        iF2 = atv.f(trackFormat, "channel-count", -1);
                        iF3 = atv.f(trackFormat, "channel-mask", -1);
                        if (iF2 != -1) {
                            iF3 = -1;
                        }
                        bsdVar.G = iF2;
                        bsdVar.H = iF3;
                        agjzVar = new agjz(4);
                        i15 = 0;
                        while (true) {
                            byteBuffer = trackFormat.getByteBuffer(a.bR(i15, "csd-"));
                            if (byteBuffer == null) {
                                bsdVar.r = agjzVar.g();
                                if (trackFormat.containsKey("track-id")) {
                                    bsdVar.c(trackFormat.getInteger("track-id"));
                                }
                                agjzVar2.h(new qwz(string2, optionalC2, optionalC, optional, optional2, optionalC3, optionalC5, optionalC6, optionalC7, new bse(bsdVar)));
                            } else {
                                byte[] bArr7 = new byte[byteBuffer.remaining()];
                                byteBuffer.get(bArr7);
                                byteBuffer.rewind();
                                agjzVar.h(bArr7);
                                i15++;
                            }
                        }
                    }
                    z = true;
                    if (true != z) {
                        i11 = i9;
                    } else {
                        i11 = i10;
                    }
                    if (i7 != i9) {
                        i12 = i7;
                        i13 = i11;
                        i14 = iF8;
                    } else if (iF8 != i9) {
                        i13 = i11;
                        i14 = iF8;
                        i12 = -1;
                    } else if (i11 == i9) {
                        if (bArr5 != null) {
                            i12 = -1;
                            i14 = -1;
                            i13 = -1;
                        } else {
                            bruVar = null;
                        }
                        bsdVar.E = bruVar;
                        bsdVar.I = atv.f(trackFormat, "sample-rate", -1);
                        iF = atv.f(trackFormat, "exo-pcm-encoding-int", -1);
                        if (iF == -1) {
                            iF = atv.f(trackFormat, "pcm-encoding", -1);
                        }
                        bsdVar.J = iF;
                        iF2 = atv.f(trackFormat, "channel-count", -1);
                        iF3 = atv.f(trackFormat, "channel-mask", -1);
                        if (iF2 != -1) {
                            iF3 = -1;
                        }
                        bsdVar.G = iF2;
                        bsdVar.H = iF3;
                        agjzVar = new agjz(4);
                        i15 = 0;
                        while (true) {
                            byteBuffer = trackFormat.getByteBuffer(a.bR(i15, "csd-"));
                            if (byteBuffer == null) {
                                bsdVar.r = agjzVar.g();
                                if (trackFormat.containsKey("track-id")) {
                                    bsdVar.c(trackFormat.getInteger("track-id"));
                                }
                                agjzVar2.h(new qwz(string2, optionalC2, optionalC, optional, optional2, optionalC3, optionalC5, optionalC6, optionalC7, new bse(bsdVar)));
                            } else {
                                byte[] bArr8 = new byte[byteBuffer.remaining()];
                                byteBuffer.get(bArr8);
                                byteBuffer.rewind();
                                agjzVar.h(bArr8);
                                i15++;
                            }
                        }
                    } else {
                        i13 = i11;
                        i12 = -1;
                        i14 = -1;
                    }
                    bruVar = new bru(i12, i14, i13, bArr5, -1, -1);
                    bsdVar.E = bruVar;
                    bsdVar.I = atv.f(trackFormat, "sample-rate", -1);
                    iF = atv.f(trackFormat, "exo-pcm-encoding-int", -1);
                    if (iF == -1) {
                        iF = atv.f(trackFormat, "pcm-encoding", -1);
                    }
                    bsdVar.J = iF;
                    iF2 = atv.f(trackFormat, "channel-count", -1);
                    iF3 = atv.f(trackFormat, "channel-mask", -1);
                    if (iF2 != -1) {
                        iF3 = -1;
                    }
                    bsdVar.G = iF2;
                    bsdVar.H = iF3;
                    agjzVar = new agjz(4);
                    i15 = 0;
                    while (true) {
                        byteBuffer = trackFormat.getByteBuffer(a.bR(i15, "csd-"));
                        if (byteBuffer == null) {
                            bsdVar.r = agjzVar.g();
                            if (trackFormat.containsKey("track-id")) {
                                bsdVar.c(trackFormat.getInteger("track-id"));
                            }
                            agjzVar2.h(new qwz(string2, optionalC2, optionalC, optional, optional2, optionalC3, optionalC5, optionalC6, optionalC7, new bse(bsdVar)));
                        } else {
                            byte[] bArr9 = new byte[byteBuffer.remaining()];
                            byteBuffer.get(bArr9);
                            byteBuffer.rewind();
                            agjzVar.h(bArr9);
                            i15++;
                        }
                    }
                } else {
                    i3 = 1;
                }
                i4 = -1;
                i5 = iF7;
                i6 = i3;
                if (i3 != i6) {
                    i7 = i4;
                } else {
                    i7 = i5;
                }
                if (iF8 != 2) {
                    i8 = i3;
                } else {
                    i8 = i3;
                }
                if (i3 != i8) {
                    iF8 = -1;
                }
                if (iF9 != i3) {
                    i9 = -1;
                    i10 = iF9;
                    z = true;
                } else {
                    i9 = -1;
                    i10 = iF9;
                    z = true;
                }
                if (true != z) {
                    i11 = i9;
                } else {
                    i11 = i10;
                }
                if (i7 != i9) {
                    i12 = i7;
                    i13 = i11;
                    i14 = iF8;
                } else if (iF8 != i9) {
                    i13 = i11;
                    i14 = iF8;
                    i12 = -1;
                } else if (i11 == i9) {
                    if (bArr5 != null) {
                        i12 = -1;
                        i14 = -1;
                        i13 = -1;
                    } else {
                        bruVar = null;
                    }
                    bsdVar.E = bruVar;
                    bsdVar.I = atv.f(trackFormat, "sample-rate", -1);
                    iF = atv.f(trackFormat, "exo-pcm-encoding-int", -1);
                    if (iF == -1) {
                        iF = atv.f(trackFormat, "pcm-encoding", -1);
                    }
                    bsdVar.J = iF;
                    iF2 = atv.f(trackFormat, "channel-count", -1);
                    iF3 = atv.f(trackFormat, "channel-mask", -1);
                    if (iF2 != -1) {
                        iF3 = -1;
                    }
                    bsdVar.G = iF2;
                    bsdVar.H = iF3;
                    agjzVar = new agjz(4);
                    i15 = 0;
                    while (true) {
                        byteBuffer = trackFormat.getByteBuffer(a.bR(i15, "csd-"));
                        if (byteBuffer == null) {
                            bsdVar.r = agjzVar.g();
                            if (trackFormat.containsKey("track-id")) {
                                bsdVar.c(trackFormat.getInteger("track-id"));
                            }
                            agjzVar2.h(new qwz(string2, optionalC2, optionalC, optional, optional2, optionalC3, optionalC5, optionalC6, optionalC7, new bse(bsdVar)));
                        } else {
                            byte[] bArr10 = new byte[byteBuffer.remaining()];
                            byteBuffer.get(bArr10);
                            byteBuffer.rewind();
                            agjzVar.h(bArr10);
                            i15++;
                        }
                    }
                } else {
                    i13 = i11;
                    i12 = -1;
                    i14 = -1;
                }
                bruVar = new bru(i12, i14, i13, bArr5, -1, -1);
                bsdVar.E = bruVar;
                bsdVar.I = atv.f(trackFormat, "sample-rate", -1);
                iF = atv.f(trackFormat, "exo-pcm-encoding-int", -1);
                if (iF == -1) {
                    iF = atv.f(trackFormat, "pcm-encoding", -1);
                }
                bsdVar.J = iF;
                iF2 = atv.f(trackFormat, "channel-count", -1);
                iF3 = atv.f(trackFormat, "channel-mask", -1);
                if (iF2 != -1) {
                    iF3 = -1;
                }
                bsdVar.G = iF2;
                bsdVar.H = iF3;
                agjzVar = new agjz(4);
                i15 = 0;
                while (true) {
                    byteBuffer = trackFormat.getByteBuffer(a.bR(i15, "csd-"));
                    if (byteBuffer == null) {
                        bsdVar.r = agjzVar.g();
                        if (trackFormat.containsKey("track-id")) {
                            bsdVar.c(trackFormat.getInteger("track-id"));
                        }
                        agjzVar2.h(new qwz(string2, optionalC2, optionalC, optional, optional2, optionalC3, optionalC5, optionalC6, optionalC7, new bse(bsdVar)));
                    } else {
                        byte[] bArr11 = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr11);
                        byteBuffer.rewind();
                        agjzVar.h(bArr11);
                        i15++;
                    }
                }
            }
            i18++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        throw new java.lang.UnsupportedOperationException("HTTPS URIs are not supported");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.qwy r5, android.content.Context r6) throws java.io.IOException {
        /*
            r4 = this;
            qwp r5 = (defpackage.qwp) r5
            android.net.Uri r5 = r5.a
            java.lang.String r0 = r5.getScheme()
            j$.util.Optional r0 = j$.util.Optional.ofNullable(r0)
            java.lang.String r1 = "file"
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r2 == r3) goto L40
            r1 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r1) goto L30
            r1 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 != r1) goto L60
            java.lang.String r1 = "https"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L60
        L30:
            java.lang.String r1 = "http"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L60
        L38:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "HTTPS URIs are not supported"
            r4.<init>(r5)
            throw r4
        L40:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L60
            java.io.FileInputStream r6 = new java.io.FileInputStream
            java.lang.String r5 = r5.getPath()
            r5.getClass()
            r6.<init>(r5)
            r4.a = r6
            qxf r4 = r4.b
            java.io.FileDescriptor r5 = r6.getFD()
            android.media.MediaExtractor r4 = r4.a
            r4.setDataSource(r5)
            goto L68
        L60:
            qxf r4 = r4.b
            android.media.MediaExtractor r4 = r4.a
            r0 = 0
            r4.setDataSource(r6, r5, r0)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxa.b(qwy, android.content.Context):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
        FileInputStream fileInputStream = this.a;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.a = null;
        }
    }
}
