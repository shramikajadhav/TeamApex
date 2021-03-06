//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.01 at 05:56:14 PM EDT 
//


package edu.sga.apex.rest.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.sga.apex.rest.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApplicationInput_QNAME = new QName("", "applicationInput");
    private final static QName _Application_QNAME = new QName("", "application");
    private final static QName _SubmitJobResponse_QNAME = new QName("", "submitJobResponse");
    private final static QName _ExperimentListResponse_QNAME = new QName("", "experimentListResponse");
    private final static QName _SimpleAPIResponse_QNAME = new QName("", "simpleAPIResponse");
    private final static QName _Machine_QNAME = new QName("", "machine");
    private final static QName _JobResponse_QNAME = new QName("", "jobResponse");
    private final static QName _ApplicationListResponse_QNAME = new QName("", "applicationListResponse");
    private final static QName _InputFile_QNAME = new QName("", "inputFile");
    private final static QName _Experiment_QNAME = new QName("", "experiment");
    private final static QName _SubmitJobRequest_QNAME = new QName("", "submitJobRequest");
    private final static QName _User_QNAME = new QName("", "user");
    private final static QName _ApiErrorResponse_QNAME = new QName("", "apiErrorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.sga.apex.rest.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplicationInput }
     * 
     */
    public ApplicationInput createApplicationInput() {
        return new ApplicationInput();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link SubmitJobResponse }
     * 
     */
    public SubmitJobResponse createSubmitJobResponse() {
        return new SubmitJobResponse();
    }

    /**
     * Create an instance of {@link ExperimentListResponse }
     * 
     */
    public ExperimentListResponse createExperimentListResponse() {
        return new ExperimentListResponse();
    }

    /**
     * Create an instance of {@link SimpleAPIResponse }
     * 
     */
    public SimpleAPIResponse createSimpleAPIResponse() {
        return new SimpleAPIResponse();
    }

    /**
     * Create an instance of {@link Machine }
     * 
     */
    public Machine createMachine() {
        return new Machine();
    }

    /**
     * Create an instance of {@link JobResponse }
     * 
     */
    public JobResponse createJobResponse() {
        return new JobResponse();
    }

    /**
     * Create an instance of {@link ApplicationListResponse }
     * 
     */
    public ApplicationListResponse createApplicationListResponse() {
        return new ApplicationListResponse();
    }

    /**
     * Create an instance of {@link InputFile }
     * 
     */
    public InputFile createInputFile() {
        return new InputFile();
    }

    /**
     * Create an instance of {@link Experiment }
     * 
     */
    public Experiment createExperiment() {
        return new Experiment();
    }

    /**
     * Create an instance of {@link SubmitJobRequest }
     * 
     */
    public SubmitJobRequest createSubmitJobRequest() {
        return new SubmitJobRequest();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ApiErrorResponse }
     * 
     */
    public ApiErrorResponse createApiErrorResponse() {
        return new ApiErrorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "applicationInput")
    public JAXBElement<ApplicationInput> createApplicationInput(ApplicationInput value) {
        return new JAXBElement<ApplicationInput>(_ApplicationInput_QNAME, ApplicationInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "application")
    public JAXBElement<Application> createApplication(Application value) {
        return new JAXBElement<Application>(_Application_QNAME, Application.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "submitJobResponse")
    public JAXBElement<SubmitJobResponse> createSubmitJobResponse(SubmitJobResponse value) {
        return new JAXBElement<SubmitJobResponse>(_SubmitJobResponse_QNAME, SubmitJobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExperimentListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "experimentListResponse")
    public JAXBElement<ExperimentListResponse> createExperimentListResponse(ExperimentListResponse value) {
        return new JAXBElement<ExperimentListResponse>(_ExperimentListResponse_QNAME, ExperimentListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAPIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "simpleAPIResponse")
    public JAXBElement<SimpleAPIResponse> createSimpleAPIResponse(SimpleAPIResponse value) {
        return new JAXBElement<SimpleAPIResponse>(_SimpleAPIResponse_QNAME, SimpleAPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Machine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "machine")
    public JAXBElement<Machine> createMachine(Machine value) {
        return new JAXBElement<Machine>(_Machine_QNAME, Machine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jobResponse")
    public JAXBElement<JobResponse> createJobResponse(JobResponse value) {
        return new JAXBElement<JobResponse>(_JobResponse_QNAME, JobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "applicationListResponse")
    public JAXBElement<ApplicationListResponse> createApplicationListResponse(ApplicationListResponse value) {
        return new JAXBElement<ApplicationListResponse>(_ApplicationListResponse_QNAME, ApplicationListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "inputFile")
    public JAXBElement<InputFile> createInputFile(InputFile value) {
        return new JAXBElement<InputFile>(_InputFile_QNAME, InputFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Experiment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "experiment")
    public JAXBElement<Experiment> createExperiment(Experiment value) {
        return new JAXBElement<Experiment>(_Experiment_QNAME, Experiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitJobRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "submitJobRequest")
    public JAXBElement<SubmitJobRequest> createSubmitJobRequest(SubmitJobRequest value) {
        return new JAXBElement<SubmitJobRequest>(_SubmitJobRequest_QNAME, SubmitJobRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apiErrorResponse")
    public JAXBElement<ApiErrorResponse> createApiErrorResponse(ApiErrorResponse value) {
        return new JAXBElement<ApiErrorResponse>(_ApiErrorResponse_QNAME, ApiErrorResponse.class, null, value);
    }

}
