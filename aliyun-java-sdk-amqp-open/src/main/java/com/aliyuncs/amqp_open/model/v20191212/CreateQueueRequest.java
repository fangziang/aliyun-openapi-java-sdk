/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.amqp_open.model.v20191212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.amqp_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateQueueRequest extends RpcAcsRequest<CreateQueueResponse> {
	   

	private String queueName;

	private String deadLetterRoutingKey;

	private Long maxLength;

	private Long autoExpireState;

	private String deadLetterExchange;

	private String instanceId;

	private Boolean exclusiveState;

	private Boolean autoDeleteState;

	private Long messageTTL;

	private String virtualHost;

	private Integer maximumPriority;
	public CreateQueueRequest() {
		super("amqp-open", "2019-12-12", "CreateQueue", "onsproxy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueueName() {
		return this.queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
		if(queueName != null){
			putBodyParameter("QueueName", queueName);
		}
	}

	public String getDeadLetterRoutingKey() {
		return this.deadLetterRoutingKey;
	}

	public void setDeadLetterRoutingKey(String deadLetterRoutingKey) {
		this.deadLetterRoutingKey = deadLetterRoutingKey;
		if(deadLetterRoutingKey != null){
			putBodyParameter("DeadLetterRoutingKey", deadLetterRoutingKey);
		}
	}

	public Long getMaxLength() {
		return this.maxLength;
	}

	public void setMaxLength(Long maxLength) {
		this.maxLength = maxLength;
		if(maxLength != null){
			putBodyParameter("MaxLength", maxLength.toString());
		}
	}

	public Long getAutoExpireState() {
		return this.autoExpireState;
	}

	public void setAutoExpireState(Long autoExpireState) {
		this.autoExpireState = autoExpireState;
		if(autoExpireState != null){
			putBodyParameter("AutoExpireState", autoExpireState.toString());
		}
	}

	public String getDeadLetterExchange() {
		return this.deadLetterExchange;
	}

	public void setDeadLetterExchange(String deadLetterExchange) {
		this.deadLetterExchange = deadLetterExchange;
		if(deadLetterExchange != null){
			putBodyParameter("DeadLetterExchange", deadLetterExchange);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Boolean getExclusiveState() {
		return this.exclusiveState;
	}

	public void setExclusiveState(Boolean exclusiveState) {
		this.exclusiveState = exclusiveState;
		if(exclusiveState != null){
			putBodyParameter("ExclusiveState", exclusiveState.toString());
		}
	}

	public Boolean getAutoDeleteState() {
		return this.autoDeleteState;
	}

	public void setAutoDeleteState(Boolean autoDeleteState) {
		this.autoDeleteState = autoDeleteState;
		if(autoDeleteState != null){
			putBodyParameter("AutoDeleteState", autoDeleteState.toString());
		}
	}

	public Long getMessageTTL() {
		return this.messageTTL;
	}

	public void setMessageTTL(Long messageTTL) {
		this.messageTTL = messageTTL;
		if(messageTTL != null){
			putBodyParameter("MessageTTL", messageTTL.toString());
		}
	}

	public String getVirtualHost() {
		return this.virtualHost;
	}

	public void setVirtualHost(String virtualHost) {
		this.virtualHost = virtualHost;
		if(virtualHost != null){
			putBodyParameter("VirtualHost", virtualHost);
		}
	}

	public Integer getMaximumPriority() {
		return this.maximumPriority;
	}

	public void setMaximumPriority(Integer maximumPriority) {
		this.maximumPriority = maximumPriority;
		if(maximumPriority != null){
			putBodyParameter("MaximumPriority", maximumPriority.toString());
		}
	}

	@Override
	public Class<CreateQueueResponse> getResponseClass() {
		return CreateQueueResponse.class;
	}

}
