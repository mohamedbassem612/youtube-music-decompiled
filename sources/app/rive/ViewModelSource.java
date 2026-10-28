package app.rive;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface ViewModelSource {

    /* JADX INFO: renamed from: app.rive.ViewModelSource$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class CC {
        public static ViewModelInstanceSource $default$blankInstance(ViewModelSource viewModelSource) {
            ViewModelInstanceSource.Blank.m343constructorimpl(viewModelSource);
            return ViewModelInstanceSource.Blank.m342boximpl(viewModelSource);
        }

        public static ViewModelInstanceSource $default$defaultInstance(ViewModelSource viewModelSource) {
            ViewModelInstanceSource.Default.m350constructorimpl(viewModelSource);
            return ViewModelInstanceSource.Default.m349boximpl(viewModelSource);
        }

        public static ViewModelInstanceSource $default$namedInstance(ViewModelSource viewModelSource, String str) {
            str.getClass();
            return new ViewModelInstanceSource.Named(viewModelSource, str);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class DefaultForArtboard implements ViewModelSource {
        private final Artboard artboard;

        private /* synthetic */ DefaultForArtboard(Artboard artboard) {
            this.artboard = artboard;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ DefaultForArtboard m356boximpl(Artboard artboard) {
            return new DefaultForArtboard(artboard);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Artboard m357constructorimpl(Artboard artboard) {
            artboard.getClass();
            return artboard;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m358equalsimpl(Artboard artboard, Object obj) {
            return (obj instanceof DefaultForArtboard) && awrc.c(artboard, ((DefaultForArtboard) obj).m362unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m359equalsimpl0(Artboard artboard, Artboard artboard2) {
            return awrc.c(artboard, artboard2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m360hashCodeimpl(Artboard artboard) {
            return artboard.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m361toStringimpl(Artboard artboard) {
            return "DefaultForArtboard(artboard=" + artboard + ')';
        }

        @Override // app.rive.ViewModelSource
        public /* synthetic */ ViewModelInstanceSource blankInstance() {
            return CC.$default$blankInstance(this);
        }

        @Override // app.rive.ViewModelSource
        public /* synthetic */ ViewModelInstanceSource defaultInstance() {
            return CC.$default$defaultInstance(this);
        }

        public boolean equals(Object obj) {
            return m358equalsimpl(this.artboard, obj);
        }

        public final Artboard getArtboard() {
            return this.artboard;
        }

        public int hashCode() {
            return m360hashCodeimpl(this.artboard);
        }

        @Override // app.rive.ViewModelSource
        public /* synthetic */ ViewModelInstanceSource namedInstance(String str) {
            return CC.$default$namedInstance(this, str);
        }

        public String toString() {
            return m361toStringimpl(this.artboard);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Artboard m362unboximpl() {
            return this.artboard;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Named implements ViewModelSource {
        private final String viewModelName;

        private /* synthetic */ Named(String str) {
            this.viewModelName = str;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Named m363boximpl(String str) {
            return new Named(str);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static String m364constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m365equalsimpl(String str, Object obj) {
            return (obj instanceof Named) && awrc.c(str, ((Named) obj).m369unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m366equalsimpl0(String str, String str2) {
            return awrc.c(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m367hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m368toStringimpl(String str) {
            return "Named(viewModelName=" + str + ')';
        }

        @Override // app.rive.ViewModelSource
        public /* synthetic */ ViewModelInstanceSource blankInstance() {
            return CC.$default$blankInstance(this);
        }

        @Override // app.rive.ViewModelSource
        public /* synthetic */ ViewModelInstanceSource defaultInstance() {
            return CC.$default$defaultInstance(this);
        }

        public boolean equals(Object obj) {
            return m365equalsimpl(this.viewModelName, obj);
        }

        public final String getViewModelName() {
            return this.viewModelName;
        }

        public int hashCode() {
            return m367hashCodeimpl(this.viewModelName);
        }

        @Override // app.rive.ViewModelSource
        public /* synthetic */ ViewModelInstanceSource namedInstance(String str) {
            return CC.$default$namedInstance(this, str);
        }

        public String toString() {
            return m368toStringimpl(this.viewModelName);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m369unboximpl() {
            return this.viewModelName;
        }
    }

    ViewModelInstanceSource blankInstance();

    ViewModelInstanceSource defaultInstance();

    ViewModelInstanceSource namedInstance(String str);
}
