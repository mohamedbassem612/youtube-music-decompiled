package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum nzs {
    COMPONENT_MATERIALIZATION("ComponentMaterialization"),
    TEMPLATE_FETCHING("TemplateFetching"),
    TEMPLATE_RESOLUTION("TemplateResolution"),
    PB_TO_FB("PbToFb"),
    ROOT_PREPARATION("RootPreparation"),
    FIRST_ROOT_PREPARATION("FirstRootPreparation"),
    FIRST_ROOT_MATERIALIZATION("FirstRootMaterialization"),
    FIRST_ROOT_MEASUREMENT("FirstRootMeasurement"),
    ROOT_PERFORM_LAYOUT("RootPerformLayout"),
    ROOT_ON_MEASURE("RootOnMeasure"),
    ROOT_MOUNTING("RootMounting"),
    ELEMENTS_LIFECYCLE_CREATE_DRAW("ElementsLifecycleCreateDraw"),
    ELEMENTS_LIFECYCLE_SET_DRAW("ElementsLifecycleSetDraw"),
    COMMAND_EXECUTION("CommandExecution"),
    NATIVE_LIBRARY_LOAD("NativeLibLoading"),
    NATIVE_LIBRARY_CHECK("NativeLibChecking"),
    FUT_PROCESSING("FrameworkUpdateTransportProcessing"),
    PAGE_INITIAL_RENDERING("PageInitialRendering"),
    FEED_SCROLL("FeedScroll"),
    TO_FOREGROUND("ToForeground"),
    TO_BACKGROUND("ToBackground"),
    WASM_TEMPLATE_LOADING("WasmTemplateLoading"),
    UNKNOWN("Unknown");

    public final String x;

    nzs(String str) {
        this.x = str;
    }
}
