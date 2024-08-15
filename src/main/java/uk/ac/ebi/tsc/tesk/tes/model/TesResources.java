package uk.ac.ebi.tsc.tesk.tes.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resources describes the resources requested by a task.
 */
@ApiModel(description = "Resources describes the resources requested by a task.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-14T19:09:22.296203-05:00[America/Chicago]")
public class TesResources   {
  @JsonProperty("cpu_cores")
  private Long cpuCores;

  @JsonProperty("preemptible")
  private Boolean preemptible;

  @JsonProperty("ram_gb")
  private Double ramGb;

  @JsonProperty("disk_gb")
  private Double diskGb;

  @JsonProperty("zones")
  @Valid
  private List<String> zones = null;

  @JsonProperty("backend_parameters_strict")
  private Boolean backendParametersStrict;

  @JsonProperty("backend_parameters")
  @Valid
  private Map<String, String> backendParameters = null;

  public TesResources cpuCores(Long cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

  /**
   * Requested number of CPUs
   * @return cpuCores
  */
  @ApiModelProperty(example = "4", value = "Requested number of CPUs")


  public Long getCpuCores() {
    return cpuCores;
  }

  public void setCpuCores(Long cpuCores) {
    this.cpuCores = cpuCores;
  }

  public TesResources preemptible(Boolean preemptible) {
    this.preemptible = preemptible;
    return this;
  }

  /**
   * Define if the task is allowed to run on preemptible compute instances, for example, AWS Spot. This option may have no effect when utilized on some backends that don't have the concept of preemptible jobs.
   * @return preemptible
  */
  @ApiModelProperty(example = "false", value = "Define if the task is allowed to run on preemptible compute instances, for example, AWS Spot. This option may have no effect when utilized on some backends that don't have the concept of preemptible jobs.")


  public Boolean getPreemptible() {
    return preemptible;
  }

  public void setPreemptible(Boolean preemptible) {
    this.preemptible = preemptible;
  }

  public TesResources ramGb(Double ramGb) {
    this.ramGb = ramGb;
    return this;
  }

  /**
   * Requested RAM required in gigabytes (GB)
   * @return ramGb
  */
  @ApiModelProperty(example = "8", value = "Requested RAM required in gigabytes (GB)")


  public Double getRamGb() {
    return ramGb;
  }

  public void setRamGb(Double ramGb) {
    this.ramGb = ramGb;
  }

  public TesResources diskGb(Double diskGb) {
    this.diskGb = diskGb;
    return this;
  }

  /**
   * Requested disk size in gigabytes (GB)
   * @return diskGb
  */
  @ApiModelProperty(example = "40", value = "Requested disk size in gigabytes (GB)")


  public Double getDiskGb() {
    return diskGb;
  }

  public void setDiskGb(Double diskGb) {
    this.diskGb = diskGb;
  }

  public TesResources zones(List<String> zones) {
    this.zones = zones;
    return this;
  }

  public TesResources addZonesItem(String zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<>();
    }
    this.zones.add(zonesItem);
    return this;
  }

  /**
   * Request that the task be run in these compute zones. How this string is utilized will be dependent on the backend system. For example, a system based on a cluster queueing system may use this string to define priorty queue to which the job is assigned.
   * @return zones
  */
  @ApiModelProperty(example = "us-west-1", value = "Request that the task be run in these compute zones. How this string is utilized will be dependent on the backend system. For example, a system based on a cluster queueing system may use this string to define priorty queue to which the job is assigned.")


  public List<String> getZones() {
    return zones;
  }

  public void setZones(List<String> zones) {
    this.zones = zones;
  }

  public TesResources backendParametersStrict(Boolean backendParametersStrict) {
    this.backendParametersStrict = backendParametersStrict;
    return this;
  }

  /**
   * If set to true, backends should fail the task if any backend_parameters key/values are unsupported, otherwise, backends should attempt to run the task
   * @return backendParametersStrict
  */
  @ApiModelProperty(value = "If set to true, backends should fail the task if any backend_parameters key/values are unsupported, otherwise, backends should attempt to run the task")


  public Boolean getBackendParametersStrict() {
    return backendParametersStrict;
  }

  public void setBackendParametersStrict(Boolean backendParametersStrict) {
    this.backendParametersStrict = backendParametersStrict;
  }

  public TesResources backendParameters(Map<String, String> backendParameters) {
    this.backendParameters = backendParameters;
    return this;
  }

  public TesResources putBackendParametersItem(String key, String backendParametersItem) {
    if (this.backendParameters == null) {
      this.backendParameters = new HashMap<>();
    }
    this.backendParameters.put(key, backendParametersItem);
    return this;
  }

  /**
   * Key/value pairs for backend configuration. ServiceInfo shall return a list of keys that a backend supports. Keys are case insensitive. It is expected that clients pass all runtime or hardware requirement key/values that are not mapped to existing tesResources properties to backend_parameters. Backends shall log system warnings if a key is passed that is unsupported. Backends shall not store or return unsupported keys if included in a task. If backend_parameters_strict equals true, backends should fail the task if any key/values are unsupported, otherwise, backends should attempt to run the task. Intended uses include VM size selection, coprocessor configuration, etc. Example: ```json {   \"backend_parameters\" : {     \"VmSize\" : \"Standard_D64_v3\"   } } ``` 
   * @return backendParameters
  */
  @ApiModelProperty(example = "{\"VmSize\":\"Standard_D64_v3\"}", value = "Key/value pairs for backend configuration. ServiceInfo shall return a list of keys that a backend supports. Keys are case insensitive. It is expected that clients pass all runtime or hardware requirement key/values that are not mapped to existing tesResources properties to backend_parameters. Backends shall log system warnings if a key is passed that is unsupported. Backends shall not store or return unsupported keys if included in a task. If backend_parameters_strict equals true, backends should fail the task if any key/values are unsupported, otherwise, backends should attempt to run the task. Intended uses include VM size selection, coprocessor configuration, etc. Example: ```json {   \"backend_parameters\" : {     \"VmSize\" : \"Standard_D64_v3\"   } } ``` ")


  public Map<String, String> getBackendParameters() {
    return backendParameters;
  }

  public void setBackendParameters(Map<String, String> backendParameters) {
    this.backendParameters = backendParameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesResources tesResources = (TesResources) o;
    return Objects.equals(this.cpuCores, tesResources.cpuCores) &&
        Objects.equals(this.preemptible, tesResources.preemptible) &&
        Objects.equals(this.ramGb, tesResources.ramGb) &&
        Objects.equals(this.diskGb, tesResources.diskGb) &&
        Objects.equals(this.zones, tesResources.zones) &&
        Objects.equals(this.backendParametersStrict, tesResources.backendParametersStrict) &&
        Objects.equals(this.backendParameters, tesResources.backendParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuCores, preemptible, ramGb, diskGb, zones, backendParametersStrict, backendParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesResources {\n");
    
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    preemptible: ").append(toIndentedString(preemptible)).append("\n");
    sb.append("    ramGb: ").append(toIndentedString(ramGb)).append("\n");
    sb.append("    diskGb: ").append(toIndentedString(diskGb)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    backendParametersStrict: ").append(toIndentedString(backendParametersStrict)).append("\n");
    sb.append("    backendParameters: ").append(toIndentedString(backendParameters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

