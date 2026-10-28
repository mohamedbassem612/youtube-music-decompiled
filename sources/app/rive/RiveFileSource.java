package app.rive;

import android.content.Context;
import android.content.res.Resources;
import defpackage.ahk;
import defpackage.ahm;
import defpackage.aog;
import defpackage.awqx;
import defpackage.awrc;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface RiveFileSource {

    /* JADX INFO: compiled from: PG */
    public final class Bytes implements RiveFileSource {
        private final byte[] data;

        private /* synthetic */ Bytes(byte[] bArr) {
            this.data = bArr;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bytes m290boximpl(byte[] bArr) {
            return new Bytes(bArr);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static byte[] m291constructorimpl(byte[] bArr) {
            bArr.getClass();
            return bArr;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m292equalsimpl(byte[] bArr, Object obj) {
            return (obj instanceof Bytes) && awrc.c(bArr, ((Bytes) obj).m296unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m293equalsimpl0(byte[] bArr, byte[] bArr2) {
            return awrc.c(bArr, bArr2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m294hashCodeimpl(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m295toStringimpl(byte[] bArr) {
            return "Bytes(data=" + Arrays.toString(bArr) + ')';
        }

        public boolean equals(Object obj) {
            return m292equalsimpl(this.data, obj);
        }

        public final byte[] getData() {
            return this.data;
        }

        public int hashCode() {
            return m294hashCodeimpl(this.data);
        }

        public String toString() {
            return m295toStringimpl(this.data);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ byte[] m296unboximpl() {
            return this.data;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class RawRes implements RiveFileSource {
        private final int resId;
        private final Resources resources;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public RawRes(int i, Resources resources) {
            resources.getClass();
            this.resId = i;
            this.resources = resources;
        }

        public static /* synthetic */ RawRes copy$default(RawRes rawRes, int i, Resources resources, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rawRes.resId;
            }
            if ((i2 & 2) != 0) {
                resources = rawRes.resources;
            }
            return rawRes.copy(i, resources);
        }

        public final int component1() {
            return this.resId;
        }

        public final Resources component2() {
            return this.resources;
        }

        public final RawRes copy(int i, Resources resources) {
            resources.getClass();
            return new RawRes(i, resources);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RawRes) {
                RawRes rawRes = (RawRes) obj;
                if (this.resId == rawRes.resId && awrc.c(this.resources, rawRes.resources)) {
                    return true;
                }
            }
            return false;
        }

        public final int getResId() {
            return this.resId;
        }

        public final Resources getResources() {
            return this.resources;
        }

        public int hashCode() {
            return (this.resId * 31) + this.resources.hashCode();
        }

        public String toString() {
            return "RawRes(resId=" + this.resId + ", resources=" + this.resources + ')';
        }

        /* JADX INFO: compiled from: PG */
        public final class Companion {
            private Companion() {
            }

            public final RawRes from(int i, ahk ahkVar, int i2) {
                ahm ahmVar = aog.a;
                Resources resources = ((Context) ahkVar.w()).getResources();
                resources.getClass();
                return new RawRes(i, resources);
            }

            public /* synthetic */ Companion(awqx awqxVar) {
                this();
            }
        }
    }
}
