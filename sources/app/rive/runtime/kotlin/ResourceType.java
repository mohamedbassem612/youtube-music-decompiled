package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ResourceType {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PG */
    public final class ResourceBytes extends ResourceType {
        public static final int $stable = 8;
        private final byte[] bytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceBytes(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.bytes = bArr;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class ResourceId extends ResourceType {
        public static final int $stable = 0;
        private final int id;

        public ResourceId(int i) {
            super(null);
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class ResourceRiveFile extends ResourceType {
        public static final int $stable = File.$stable;
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceRiveFile(File file) {
            super(null);
            file.getClass();
            this.file = file;
        }

        public final File getFile() {
            return this.file;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class ResourceUrl extends ResourceType {
        public static final int $stable = 0;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceUrl(String str) {
            super(null);
            str.getClass();
            this.url = str;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    private ResourceType() {
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final ResourceType makeMaybeResource(Object obj) {
            int iSwitchDispatch = ResourceType$Companion$$ExternalSyntheticTypeSwitchClass0.switchDispatch(obj, 0);
            if (iSwitchDispatch == -1) {
                return null;
            }
            if (iSwitchDispatch == 0) {
                return new ResourceId(((Number) obj).intValue());
            }
            if (iSwitchDispatch == 1) {
                return new ResourceUrl((String) obj);
            }
            if (iSwitchDispatch == 2) {
                return new ResourceBytes((byte[]) obj);
            }
            if (iSwitchDispatch == 3) {
                return new ResourceRiveFile((File) obj);
            }
            throw new IllegalArgumentException("Incompatible type " + obj.getClass().getSimpleName() + '.');
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ ResourceType(awqx awqxVar) {
        this();
    }
}
