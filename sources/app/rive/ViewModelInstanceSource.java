package app.rive;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface ViewModelInstanceSource {

    /* JADX INFO: compiled from: PG */
    public final class Blank implements ViewModelInstanceSource {
        private final ViewModelSource vmSource;

        private /* synthetic */ Blank(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Blank m342boximpl(ViewModelSource viewModelSource) {
            return new Blank(viewModelSource);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m343constructorimpl(ViewModelSource viewModelSource) {
            viewModelSource.getClass();
            return viewModelSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m344equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Blank) && awrc.c(viewModelSource, ((Blank) obj).m348unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m345equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return awrc.c(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m346hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m347toStringimpl(ViewModelSource viewModelSource) {
            return "Blank(vmSource=" + viewModelSource + ')';
        }

        public boolean equals(Object obj) {
            return m344equalsimpl(this.vmSource, obj);
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m346hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m347toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m348unboximpl() {
            return this.vmSource;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Default implements ViewModelInstanceSource {
        private final ViewModelSource vmSource;

        private /* synthetic */ Default(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Default m349boximpl(ViewModelSource viewModelSource) {
            return new Default(viewModelSource);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m350constructorimpl(ViewModelSource viewModelSource) {
            viewModelSource.getClass();
            return viewModelSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m351equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Default) && awrc.c(viewModelSource, ((Default) obj).m355unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m352equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return awrc.c(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m353hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m354toStringimpl(ViewModelSource viewModelSource) {
            return "Default(vmSource=" + viewModelSource + ')';
        }

        public boolean equals(Object obj) {
            return m351equalsimpl(this.vmSource, obj);
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m353hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m354toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m355unboximpl() {
            return this.vmSource;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Named implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final String instanceName;
        private final ViewModelSource vmSource;

        public Named(ViewModelSource viewModelSource, String str) {
            viewModelSource.getClass();
            str.getClass();
            this.vmSource = viewModelSource;
            this.instanceName = str;
        }

        public static /* synthetic */ Named copy$default(Named named, ViewModelSource viewModelSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                viewModelSource = named.vmSource;
            }
            if ((i & 2) != 0) {
                str = named.instanceName;
            }
            return named.copy(viewModelSource, str);
        }

        public final ViewModelSource component1() {
            return this.vmSource;
        }

        public final String component2() {
            return this.instanceName;
        }

        public final Named copy(ViewModelSource viewModelSource, String str) {
            viewModelSource.getClass();
            str.getClass();
            return new Named(viewModelSource, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Named) {
                Named named = (Named) obj;
                if (awrc.c(this.vmSource, named.vmSource) && awrc.c(this.instanceName, named.instanceName)) {
                    return true;
                }
            }
            return false;
        }

        public final String getInstanceName() {
            return this.instanceName;
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return (this.vmSource.hashCode() * 31) + this.instanceName.hashCode();
        }

        public String toString() {
            return "Named(vmSource=" + this.vmSource + ", instanceName=" + this.instanceName + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Reference implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final ViewModelInstance parentInstance;
        private final String path;

        public Reference(ViewModelInstance viewModelInstance, String str) {
            viewModelInstance.getClass();
            str.getClass();
            this.parentInstance = viewModelInstance;
            this.path = str;
        }

        public static /* synthetic */ Reference copy$default(Reference reference, ViewModelInstance viewModelInstance, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                viewModelInstance = reference.parentInstance;
            }
            if ((i & 2) != 0) {
                str = reference.path;
            }
            return reference.copy(viewModelInstance, str);
        }

        public final ViewModelInstance component1() {
            return this.parentInstance;
        }

        public final String component2() {
            return this.path;
        }

        public final Reference copy(ViewModelInstance viewModelInstance, String str) {
            viewModelInstance.getClass();
            str.getClass();
            return new Reference(viewModelInstance, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Reference) {
                Reference reference = (Reference) obj;
                if (awrc.c(this.parentInstance, reference.parentInstance) && awrc.c(this.path, reference.path)) {
                    return true;
                }
            }
            return false;
        }

        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return (this.parentInstance.hashCode() * 31) + this.path.hashCode();
        }

        public String toString() {
            return "Reference(parentInstance=" + this.parentInstance + ", path=" + this.path + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class ReferenceListItem implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final int index;
        private final ViewModelInstance parentInstance;
        private final String pathToList;

        public ReferenceListItem(ViewModelInstance viewModelInstance, String str, int i) {
            viewModelInstance.getClass();
            str.getClass();
            this.parentInstance = viewModelInstance;
            this.pathToList = str;
            this.index = i;
        }

        public static /* synthetic */ ReferenceListItem copy$default(ReferenceListItem referenceListItem, ViewModelInstance viewModelInstance, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                viewModelInstance = referenceListItem.parentInstance;
            }
            if ((i2 & 2) != 0) {
                str = referenceListItem.pathToList;
            }
            if ((i2 & 4) != 0) {
                i = referenceListItem.index;
            }
            return referenceListItem.copy(viewModelInstance, str, i);
        }

        public final ViewModelInstance component1() {
            return this.parentInstance;
        }

        public final String component2() {
            return this.pathToList;
        }

        public final int component3() {
            return this.index;
        }

        public final ReferenceListItem copy(ViewModelInstance viewModelInstance, String str, int i) {
            viewModelInstance.getClass();
            str.getClass();
            return new ReferenceListItem(viewModelInstance, str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ReferenceListItem) {
                ReferenceListItem referenceListItem = (ReferenceListItem) obj;
                if (awrc.c(this.parentInstance, referenceListItem.parentInstance) && awrc.c(this.pathToList, referenceListItem.pathToList) && this.index == referenceListItem.index) {
                    return true;
                }
            }
            return false;
        }

        public final int getIndex() {
            return this.index;
        }

        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        public final String getPathToList() {
            return this.pathToList;
        }

        public int hashCode() {
            return (((this.parentInstance.hashCode() * 31) + this.pathToList.hashCode()) * 31) + this.index;
        }

        public String toString() {
            return "ReferenceListItem(parentInstance=" + this.parentInstance + ", pathToList=" + this.pathToList + ", index=" + this.index + ')';
        }
    }
}
