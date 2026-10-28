package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awtl implements Comparable {
    public static final /* synthetic */ int b = 0;
    private static final long c = awrc.h(4611686018427387903L);
    private static final long d = awrc.h(-4611686018427387903L);
    public final long a;

    public static int a(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return awrc.a(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j(j) ? -i : i;
    }

    public static final long b(long j) {
        return (!k(j) || i(j)) ? g(j, awtn.MILLISECONDS) : j >> 1;
    }

    public static final long c(long j) {
        boolean zL = l(j);
        long j2 = j >> 1;
        if (zL) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j2 * 1000000;
    }

    public static final long d(long j) {
        return g(j, awtn.SECONDS);
    }

    public static final long e(long j, long j2) {
        return f(j, h(j2));
    }

    public static final long f(long j, long j2) {
        long j3;
        int i = ((int) j2) & 1;
        long j4 = j2 >> 1;
        long j5 = j >> 1;
        if ((((int) j) & 1) != i) {
            return k(j) ? m(j5, j4) : m(j4, j5);
        }
        if (!l(j)) {
            long jG = awrc.g(j5, j4);
            if (jG == 9223372036854759646L) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            if (jG != 4611686018427387903L) {
                if (jG == -4611686018427387903L) {
                    jG = -4611686018427387903L;
                } else {
                    if (jG < -4611686018426L || jG >= 4611686018427L) {
                        return awrc.h(awro.j(jG, -4611686018427387903L, 4611686018427387903L));
                    }
                    j3 = jG * 1000000;
                    int i2 = awtm.a;
                }
            }
            return awrc.h(jG);
        }
        j3 = j5 + j4;
        if (j3 < -4611686018426999999L || j3 >= 4611686018427000000L) {
            return awrc.h(j3 / 1000000);
        }
        int i3 = awtm.a;
        return j3 << 1;
    }

    public static final long g(long j, awtn awtnVar) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return awtnVar.h.convert(j >> 1, ((((int) j) & 1) == 0 ? awtn.NANOSECONDS : awtn.MILLISECONDS).h);
    }

    public static final long h(long j) {
        int i = awtm.a;
        return ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
    }

    public static final boolean i(long j) {
        return j == c || j == d;
    }

    public static final boolean j(long j) {
        return j < 0;
    }

    private static final boolean k(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean l(long j) {
        return (((int) j) & 1) == 0;
    }

    private static final long m(long j, long j2) {
        long j3 = j2 / 1000000;
        long jG = awrc.g(j, j3);
        if (jG < -4611686018426L || jG >= 4611686018427L) {
            return awrc.h(jG);
        }
        long j4 = jG * 1000000;
        int i = awtm.a;
        return (j4 + (j2 - (j3 * 1000000))) << 1;
    }

    private static final void n(StringBuilder sb, int i, int i2, int i3, String str) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            strValueOf.getClass();
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                if (length > 0) {
                    int i4 = 1;
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) == '0') {
                        if (i6 < 0) {
                            break;
                        } else {
                            length2 = i6;
                        }
                    } else {
                        i5 = length2;
                        break;
                    }
                }
            }
            int i7 = i5 + 1;
            if (i7 < 3) {
                sb.append((CharSequence) string, 0, i7);
            } else {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a(this.a, ((awtl) obj).a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awtl) && this.a == ((awtl) obj).a;
    }

    public final int hashCode() {
        return a.ak(this.a);
    }

    public final String toString() {
        int i;
        boolean z;
        int i2;
        long jH = this.a;
        if (jH == 0) {
            return "0s";
        }
        if (jH == c) {
            return "Infinity";
        }
        if (jH == d) {
            return "-Infinity";
        }
        StringBuilder sb = new StringBuilder();
        boolean zJ = j(jH);
        if (zJ) {
            sb.append('-');
        }
        if (j(jH)) {
            jH = h(jH);
        }
        long jG = g(jH, awtn.DAYS);
        int i3 = 0;
        int iG = i(jH) ? 0 : (int) (g(jH, awtn.HOURS) % 24);
        int iG2 = i(jH) ? 0 : (int) (g(jH, awtn.MINUTES) % 60);
        int iD = i(jH) ? 0 : (int) (d(jH) % 60);
        if (i(jH)) {
            i = 0;
        } else {
            long j = jH >> 1;
            i = (int) (k(jH) ? (j % 1000) * 1000000 : j % 1000000000);
        }
        boolean z2 = jG != 0;
        boolean z3 = iG != 0;
        boolean z4 = iG2 != 0;
        if (iD != 0) {
            z = true;
        } else if (i != 0) {
            iD = 0;
            z = true;
        } else {
            i = 0;
            iD = 0;
            z = false;
        }
        if (z2) {
            sb.append(jG);
            sb.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iG);
            sb.append('h');
            i2 = i4;
        }
        if (z4 || (z && (z3 || z2))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iG2);
            sb.append('m');
            i2 = i5;
        }
        if (z) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iD == 0) {
                if (!z2 && !z3 && !z4) {
                    if (i >= 1000000) {
                        n(sb, i / 1000000, i % 1000000, 6, "ms");
                    } else if (i >= 1000) {
                        n(sb, i / 1000, i % 1000, 3, "us");
                    } else {
                        sb.append(i);
                        sb.append("ns");
                    }
                }
                i2 = i6;
            } else {
                i3 = iD;
            }
            n(sb, i3, i, 9, "s");
            i2 = i6;
        }
        if (zJ && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
