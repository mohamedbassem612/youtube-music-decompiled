package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cgo {
    public static final Object a = new Object();
    public static ScheduledExecutorService b;
    public static int c;
    public final AudioTrack d;
    public final cft e;
    public final float f;
    public cgk g;
    public final cgr h;
    public final boolean i;
    public final cgn j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public final dje p = new dje(Thread.currentThread());
    public final qcb q;
    private final int r;

    public cgo(AudioTrack audioTrack, cft cftVar, qcb qcbVar, float f, bvd bvdVar) {
        int iJ;
        this.d = audioTrack;
        this.e = cftVar;
        this.f = f;
        this.q = qcbVar;
        boolean zAb = bwp.ab(cftVar.a);
        this.i = zAb;
        if (zAb) {
            iJ = bwp.j(cftVar.a) * Integer.bitCount(cftVar.c);
            this.r = iJ;
        } else {
            iJ = -1;
            this.r = -1;
        }
        int i = iJ;
        if (bsc.c(10) && zAb && !cftVar.d) {
            audioTrack.play();
            audioTrack.pause();
        }
        this.h = new cgr(new qcb(this), bvdVar, audioTrack, cftVar.a, i, cftVar.e);
        if (qcbVar != null) {
            this.g = new cgk(audioTrack, qcbVar);
        }
        this.j = g() ? new cgn(this) : null;
    }

    public final int a() {
        return this.d.getSampleRate();
    }

    public final long b() {
        return this.d.getBufferSizeInFrames();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:56:0x019d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01de  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0203  */
    /* JADX WARN: Code duplicated, block: B:73:0x0208  */
    /* JADX WARN: Code duplicated, block: B:75:0x020b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0215  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:80:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x0241  */
    /* JADX WARN: Code duplicated, block: B:84:0x0246  */
    /* JADX WARN: Code duplicated, block: B:85:0x0251  */
    /* JADX WARN: Code duplicated, block: B:86:0x0256  */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:90:0x0263  */
    /* JADX WARN: Code duplicated, block: B:92:0x0274  */
    /* JADX WARN: Code duplicated, block: B:94:0x027b  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x014a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x019d, please report this as an issue */
    public final long c() {
        AudioTrack audioTrack;
        long j;
        long j2;
        cgr cgrVar;
        int i;
        long j3;
        long j4;
        long j5;
        cgh cghVar;
        float f;
        long jB;
        cgg cggVar;
        AudioTimestamp audioTimestamp;
        boolean timestamp;
        long j6;
        cgr cgrVar2;
        boolean z;
        float f2;
        int i2;
        int i3;
        long j7;
        long j8;
        long j9;
        long j10;
        long jA;
        long jA2;
        long j11;
        long j12;
        Method method;
        long j13;
        long jD = d();
        cgr cgrVar3 = this.h;
        AudioTrack audioTrack2 = cgrVar3.c;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jC = cgrVar3.a.c() / 1000;
            j = 1000;
            if (jC - cgrVar3.k >= 30000) {
                long jC2 = cgrVar3.c();
                if (jC2 == 0) {
                    jD = jD;
                    cgrVar = cgrVar3;
                    audioTrack = audioTrack2;
                    j2 = 0;
                } else {
                    long[] jArr = cgrVar3.b;
                    jArr[cgrVar3.o] = bwp.x(jC2, cgrVar3.h) - jC;
                    cgrVar3.o = (cgrVar3.o + 1) % 10;
                    int i4 = cgrVar3.p;
                    if (i4 < 10) {
                        cgrVar3.p = i4 + 1;
                    }
                    cgrVar3.k = jC;
                    cgrVar3.j = 0L;
                    int i5 = 0;
                    while (true) {
                        int i6 = cgrVar3.p;
                        if (i5 >= i6) {
                            break;
                        }
                        int i7 = i5;
                        cgrVar3.j += jArr[i7] / ((long) i6);
                        i5 = i7 + 1;
                    }
                    j3 = cgrVar3.m;
                    if (cgrVar3.f || (method = cgrVar3.l) == null) {
                        j4 = 500000;
                    } else {
                        j4 = 500000;
                        if (jC - cgrVar3.n >= 500000) {
                            try {
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                int i8 = bwp.a;
                                j13 = jC;
                                try {
                                    long jIntValue = (((long) num.intValue()) * 1000) - cgrVar3.e;
                                    cgrVar3.m = jIntValue;
                                    long jMax = Math.max(jIntValue, 0L);
                                    cgrVar3.m = jMax;
                                    if (jMax > 10000000) {
                                        bvx.e("AudioTrackAudioOutput", a.bS(jMax, "Ignoring impossibly large audio latency: "));
                                        cgrVar3.m = 0L;
                                    }
                                } catch (Exception unused) {
                                    cgrVar3.l = null;
                                }
                            } catch (Exception unused2) {
                                j13 = jC;
                            }
                            jC = j13;
                            cgrVar3.n = jC;
                        }
                    }
                    j5 = cgrVar3.m;
                    cghVar = cgrVar3.g;
                    f = cgrVar3.h;
                    j2 = 0;
                    jB = cgrVar3.b(jC);
                    if (j3 == j5 || jC - cghVar.e >= cghVar.d) {
                        cghVar.e = jC;
                        cggVar = cghVar.a;
                        AudioTrack audioTrack3 = cggVar.a;
                        audioTimestamp = cggVar.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j11 = audioTimestamp.framePosition;
                            j12 = cggVar.d;
                            if (j12 > j11) {
                                j6 = j4;
                                if (cggVar.f) {
                                    cggVar.g += j12;
                                    cggVar.f = false;
                                } else {
                                    cggVar.c++;
                                }
                            } else {
                                j6 = j4;
                            }
                            cggVar.d = j11;
                            cggVar.e = j11 + cggVar.g + (cggVar.c << 32);
                        } else {
                            j6 = j4;
                        }
                        if (timestamp) {
                            jA = cggVar.a();
                            jA2 = cghVar.a(jC, f);
                            audioTrack = audioTrack2;
                            if (Math.abs(jA - jC) > 5000000) {
                                qcb qcbVar = cghVar.h;
                                f2 = f;
                                z = timestamp;
                                cgrVar2 = cgrVar3;
                                String str = "Spurious audio timestamp (system clock mismatch): " + cggVar.e + ", " + jA + ", " + jC + ", " + jB + ", " + ((cgo) qcbVar.a).d();
                                int i9 = bst.a;
                                bvx.e("AudioTrackAudioOutput", str);
                                cghVar.c(4);
                            } else {
                                cgrVar2 = cgrVar3;
                                z = timestamp;
                                f2 = f;
                                if (Math.abs(jA2 - jB) > 5000000) {
                                    qcb qcbVar2 = cghVar.h;
                                    String str2 = "Spurious audio timestamp (frame position mismatch): " + cggVar.e + ", " + jA + ", " + jC + ", " + jB + ", " + ((cgo) qcbVar2.a).d();
                                    int i10 = bst.a;
                                    bvx.e("AudioTrackAudioOutput", str2);
                                    cghVar.c(4);
                                } else {
                                    if (cghVar.b == 4) {
                                        i2 = 0;
                                        cghVar.c(0);
                                    }
                                    i3 = cghVar.b;
                                    if (i3 != 0) {
                                        if (i3 != 1) {
                                            if (i3 != 2) {
                                                if (i3 == 3 && z) {
                                                    cghVar.c(i2);
                                                }
                                            } else if (!z) {
                                                cghVar.c(i2);
                                            }
                                        } else if (z) {
                                            j7 = cggVar.e;
                                            j8 = jC;
                                            j9 = cghVar.f;
                                            if (j7 <= j9) {
                                                j10 = j8;
                                            } else {
                                                j10 = j8;
                                                if (Math.abs(cghVar.a(j10, f2) - cghVar.b(j9, cghVar.g, j8, f2)) < 1000) {
                                                    cghVar.c(2);
                                                }
                                            }
                                            if (j10 - cghVar.c > 2000000) {
                                                cghVar.c(3);
                                            } else {
                                                cghVar.f = cggVar.e;
                                                cghVar.g = cggVar.a();
                                            }
                                        } else {
                                            cghVar.c(0);
                                        }
                                    } else if (z) {
                                        if (cggVar.a() >= cghVar.c) {
                                            cghVar.f = cggVar.e;
                                            cghVar.g = cggVar.a();
                                            cghVar.c(1);
                                        }
                                    } else if (jC - cghVar.c > j6) {
                                        cghVar.c(3);
                                    }
                                    cgrVar = cgrVar2;
                                }
                            }
                        } else {
                            cgrVar2 = cgrVar3;
                            audioTrack = audioTrack2;
                            z = timestamp;
                            f2 = f;
                        }
                        i2 = 0;
                        i3 = cghVar.b;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        cghVar.c(i2);
                                    }
                                } else if (!z) {
                                    cghVar.c(i2);
                                }
                            } else if (z) {
                                j7 = cggVar.e;
                                j8 = jC;
                                j9 = cghVar.f;
                                if (j7 <= j9) {
                                    j10 = j8;
                                } else {
                                    j10 = j8;
                                    if (Math.abs(cghVar.a(j10, f2) - cghVar.b(j9, cghVar.g, j8, f2)) < 1000) {
                                        cghVar.c(2);
                                    }
                                }
                                if (j10 - cghVar.c > 2000000) {
                                    cghVar.c(3);
                                } else {
                                    cghVar.f = cggVar.e;
                                    cghVar.g = cggVar.a();
                                }
                            } else {
                                cghVar.c(0);
                            }
                        } else if (z) {
                            if (cggVar.a() >= cghVar.c) {
                                cghVar.f = cggVar.e;
                                cghVar.g = cggVar.a();
                                cghVar.c(1);
                            }
                        } else if (jC - cghVar.c > j6) {
                            cghVar.c(3);
                        }
                        cgrVar = cgrVar2;
                    } else {
                        jD = jD;
                        cgrVar = cgrVar3;
                        audioTrack = audioTrack2;
                    }
                }
            } else {
                j3 = cgrVar3.m;
                if (cgrVar3.f) {
                    j4 = 500000;
                } else {
                    j4 = 500000;
                }
                j5 = cgrVar3.m;
                cghVar = cgrVar3.g;
                f = cgrVar3.h;
                j2 = 0;
                jB = cgrVar3.b(jC);
                if (j3 == j5) {
                    cghVar.e = jC;
                    cggVar = cghVar.a;
                    AudioTrack audioTrack4 = cggVar.a;
                    audioTimestamp = cggVar.b;
                    timestamp = audioTrack4.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j11 = audioTimestamp.framePosition;
                        j12 = cggVar.d;
                        if (j12 > j11) {
                            j6 = j4;
                            if (cggVar.f) {
                                cggVar.g += j12;
                                cggVar.f = false;
                            } else {
                                cggVar.c++;
                            }
                        } else {
                            j6 = j4;
                        }
                        cggVar.d = j11;
                        cggVar.e = j11 + cggVar.g + (cggVar.c << 32);
                    } else {
                        j6 = j4;
                    }
                    if (timestamp) {
                        jA = cggVar.a();
                        jA2 = cghVar.a(jC, f);
                        audioTrack = audioTrack2;
                        if (Math.abs(jA - jC) > 5000000) {
                            qcb qcbVar3 = cghVar.h;
                            f2 = f;
                            z = timestamp;
                            cgrVar2 = cgrVar3;
                            String str3 = "Spurious audio timestamp (system clock mismatch): " + cggVar.e + ", " + jA + ", " + jC + ", " + jB + ", " + ((cgo) qcbVar3.a).d();
                            int i11 = bst.a;
                            bvx.e("AudioTrackAudioOutput", str3);
                            cghVar.c(4);
                        } else {
                            cgrVar2 = cgrVar3;
                            z = timestamp;
                            f2 = f;
                            if (Math.abs(jA2 - jB) > 5000000) {
                                qcb qcbVar4 = cghVar.h;
                                String str4 = "Spurious audio timestamp (frame position mismatch): " + cggVar.e + ", " + jA + ", " + jC + ", " + jB + ", " + ((cgo) qcbVar4.a).d();
                                int i12 = bst.a;
                                bvx.e("AudioTrackAudioOutput", str4);
                                cghVar.c(4);
                            } else {
                                if (cghVar.b == 4) {
                                    i2 = 0;
                                    cghVar.c(0);
                                }
                                i3 = cghVar.b;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                cghVar.c(i2);
                                            }
                                        } else if (!z) {
                                            cghVar.c(i2);
                                        }
                                    } else if (z) {
                                        j7 = cggVar.e;
                                        j8 = jC;
                                        j9 = cghVar.f;
                                        if (j7 <= j9) {
                                            j10 = j8;
                                        } else {
                                            j10 = j8;
                                            if (Math.abs(cghVar.a(j10, f2) - cghVar.b(j9, cghVar.g, j8, f2)) < 1000) {
                                                cghVar.c(2);
                                            }
                                        }
                                        if (j10 - cghVar.c > 2000000) {
                                            cghVar.c(3);
                                        } else {
                                            cghVar.f = cggVar.e;
                                            cghVar.g = cggVar.a();
                                        }
                                    } else {
                                        cghVar.c(0);
                                    }
                                } else if (z) {
                                    if (cggVar.a() >= cghVar.c) {
                                        cghVar.f = cggVar.e;
                                        cghVar.g = cggVar.a();
                                        cghVar.c(1);
                                    }
                                } else if (jC - cghVar.c > j6) {
                                    cghVar.c(3);
                                }
                                cgrVar = cgrVar2;
                            }
                        }
                    } else {
                        cgrVar2 = cgrVar3;
                        audioTrack = audioTrack2;
                        z = timestamp;
                        f2 = f;
                    }
                    i2 = 0;
                    i3 = cghVar.b;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    cghVar.c(i2);
                                }
                            } else if (!z) {
                                cghVar.c(i2);
                            }
                        } else if (z) {
                            j7 = cggVar.e;
                            j8 = jC;
                            j9 = cghVar.f;
                            if (j7 <= j9) {
                                j10 = j8;
                            } else {
                                j10 = j8;
                                if (Math.abs(cghVar.a(j10, f2) - cghVar.b(j9, cghVar.g, j8, f2)) < 1000) {
                                    cghVar.c(2);
                                }
                            }
                            if (j10 - cghVar.c > 2000000) {
                                cghVar.c(3);
                            } else {
                                cghVar.f = cggVar.e;
                                cghVar.g = cggVar.a();
                            }
                        } else {
                            cghVar.c(0);
                        }
                    } else if (z) {
                        if (cggVar.a() >= cghVar.c) {
                            cghVar.f = cggVar.e;
                            cghVar.g = cggVar.a();
                            cghVar.c(1);
                        }
                    } else if (jC - cghVar.c > j6) {
                        cghVar.c(3);
                    }
                    cgrVar = cgrVar2;
                } else {
                    cghVar.e = jC;
                    cggVar = cghVar.a;
                    AudioTrack audioTrack5 = cggVar.a;
                    audioTimestamp = cggVar.b;
                    timestamp = audioTrack5.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j11 = audioTimestamp.framePosition;
                        j12 = cggVar.d;
                        if (j12 > j11) {
                            j6 = j4;
                            if (cggVar.f) {
                                cggVar.g += j12;
                                cggVar.f = false;
                            } else {
                                cggVar.c++;
                            }
                        } else {
                            j6 = j4;
                        }
                        cggVar.d = j11;
                        cggVar.e = j11 + cggVar.g + (cggVar.c << 32);
                    } else {
                        j6 = j4;
                    }
                    if (timestamp) {
                        jA = cggVar.a();
                        jA2 = cghVar.a(jC, f);
                        audioTrack = audioTrack2;
                        if (Math.abs(jA - jC) > 5000000) {
                            qcb qcbVar5 = cghVar.h;
                            f2 = f;
                            z = timestamp;
                            cgrVar2 = cgrVar3;
                            String str5 = "Spurious audio timestamp (system clock mismatch): " + cggVar.e + ", " + jA + ", " + jC + ", " + jB + ", " + ((cgo) qcbVar5.a).d();
                            int i13 = bst.a;
                            bvx.e("AudioTrackAudioOutput", str5);
                            cghVar.c(4);
                        } else {
                            cgrVar2 = cgrVar3;
                            z = timestamp;
                            f2 = f;
                            if (Math.abs(jA2 - jB) > 5000000) {
                                qcb qcbVar6 = cghVar.h;
                                String str6 = "Spurious audio timestamp (frame position mismatch): " + cggVar.e + ", " + jA + ", " + jC + ", " + jB + ", " + ((cgo) qcbVar6.a).d();
                                int i14 = bst.a;
                                bvx.e("AudioTrackAudioOutput", str6);
                                cghVar.c(4);
                            } else {
                                if (cghVar.b == 4) {
                                    i2 = 0;
                                    cghVar.c(0);
                                }
                                i3 = cghVar.b;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                cghVar.c(i2);
                                            }
                                        } else if (!z) {
                                            cghVar.c(i2);
                                        }
                                    } else if (z) {
                                        j7 = cggVar.e;
                                        j8 = jC;
                                        j9 = cghVar.f;
                                        if (j7 <= j9) {
                                            j10 = j8;
                                        } else {
                                            j10 = j8;
                                            if (Math.abs(cghVar.a(j10, f2) - cghVar.b(j9, cghVar.g, j8, f2)) < 1000) {
                                                cghVar.c(2);
                                            }
                                        }
                                        if (j10 - cghVar.c > 2000000) {
                                            cghVar.c(3);
                                        } else {
                                            cghVar.f = cggVar.e;
                                            cghVar.g = cggVar.a();
                                        }
                                    } else {
                                        cghVar.c(0);
                                    }
                                } else if (z) {
                                    if (cggVar.a() >= cghVar.c) {
                                        cghVar.f = cggVar.e;
                                        cghVar.g = cggVar.a();
                                        cghVar.c(1);
                                    }
                                } else if (jC - cghVar.c > j6) {
                                    cghVar.c(3);
                                }
                                cgrVar = cgrVar2;
                            }
                        }
                    } else {
                        cgrVar2 = cgrVar3;
                        audioTrack = audioTrack2;
                        z = timestamp;
                        f2 = f;
                    }
                    i2 = 0;
                    i3 = cghVar.b;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    cghVar.c(i2);
                                }
                            } else if (!z) {
                                cghVar.c(i2);
                            }
                        } else if (z) {
                            j7 = cggVar.e;
                            j8 = jC;
                            j9 = cghVar.f;
                            if (j7 <= j9) {
                                j10 = j8;
                            } else {
                                j10 = j8;
                                if (Math.abs(cghVar.a(j10, f2) - cghVar.b(j9, cghVar.g, j8, f2)) < 1000) {
                                    cghVar.c(2);
                                }
                            }
                            if (j10 - cghVar.c > 2000000) {
                                cghVar.c(3);
                            } else {
                                cghVar.f = cggVar.e;
                                cghVar.g = cggVar.a();
                            }
                        } else {
                            cghVar.c(0);
                        }
                    } else if (z) {
                        if (cggVar.a() >= cghVar.c) {
                            cghVar.f = cggVar.e;
                            cghVar.g = cggVar.a();
                            cghVar.c(1);
                        }
                    } else if (jC - cghVar.c > j6) {
                        cghVar.c(3);
                    }
                    cgrVar = cgrVar2;
                }
            }
        } else {
            jD = jD;
            audioTrack = audioTrack2;
            j = 1000;
            j2 = 0;
            cgrVar = cgrVar3;
        }
        long jC3 = cgrVar.a.c() / j;
        cgh cghVar2 = cgrVar.g;
        boolean z2 = cghVar2.b == 2;
        long jA3 = z2 ? cghVar2.a(jC3, cgrVar.h) : cgrVar.b(jC3);
        long jB2 = bwp.B(jD, cgrVar.d);
        if (jA3 >= jB2) {
            cgrVar.e();
            cghVar2.c(0);
            return jB2;
        }
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState != 1) {
                return jA3;
            }
            cgrVar.d(jA3);
            return jA3;
        }
        if (z2 || ((i = cghVar2.b) != 0 && i != 1)) {
            cgrVar.d(jA3);
        }
        long j14 = cgrVar.v;
        if (j14 != -9223372036854775807L) {
            long j15 = jA3 - cgrVar.u;
            long jV = bwp.v(jC3 - j14, cgrVar.h);
            long j16 = cgrVar.u + jV;
            long jAbs = Math.abs(j16 - jA3);
            if (j15 != j2 && jAbs < 1000000) {
                long j17 = (jV * 10) / 100;
                jA3 = bwp.t(jA3, j16 - j17, j16 + j17);
            }
        }
        cgrVar.v = jC3;
        cgrVar.u = jA3;
        return jA3;
    }

    public final long d() {
        if (!this.i) {
            return this.m;
        }
        long j = this.l;
        int i = this.r;
        int i2 = bwp.a;
        long j2 = i;
        return ((j + j2) - 1) / j2;
    }

    public final void e(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.d.setOffloadDelayPadding(i, i2);
        }
    }

    public final void f(AudioDeviceInfo audioDeviceInfo) {
        this.d.setPreferredDevice(audioDeviceInfo);
    }

    public final boolean g() {
        return Build.VERSION.SDK_INT >= 29 && this.d.isOffloadedPlayback();
    }
}
